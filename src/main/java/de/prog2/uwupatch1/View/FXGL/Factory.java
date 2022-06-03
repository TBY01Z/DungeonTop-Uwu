package de.prog2.uwupatch1.View.FXGL;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.*;
import com.almasb.fxgl.entity.components.CollidableComponent;
import com.almasb.fxgl.input.view.KeyView;
import com.almasb.fxgl.physics.BoundingShape;
import com.almasb.fxgl.physics.HitBox;
import com.almasb.fxgl.physics.PhysicsComponent;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;

import static de.prog2.uwupatch1.View.FXGL.Type.*;

public class Factory implements EntityFactory {

    @Spawns("border")
    public Entity newBorder(SpawnData data){
        return FXGL.entityBuilder(data)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new PhysicsComponent())
                .buildAndAttach();
    }

    @Spawns("mapTile")
    public Entity newMapTile(SpawnData data){
        return FXGL.entityBuilder(data)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .buildAndAttach();  //kein physics component weil nur collision detection notwendig
    }

    @Spawns("keyCode")
    public Entity newKeyCode(SpawnData data){
        String key = data.get("key");
        KeyCode keyCode = KeyCode.getKeyCode(key);

        return FXGL.entityBuilder(data)
                .view(new KeyView(keyCode, Color.YELLOW, 24))
//                .with(new LiftComponent(Duration.seconds(0.76), 6, true))  //konstruktor ist ein massiver hurensohn
                .zIndex(100)
                .buildAndAttach();
    }

    @Spawns("gameEvent")
    public Entity newGameEvent(SpawnData data){
        var keyEntity = FXGL.getGameWorld().create("keyCode", new SpawnData(data.getX(),
                data.getY() - 50).put("key", "E"));
        keyEntity.getViewComponent().opacityProperty().setValue(0); //wenn Player sich auf gameEvent befindet, erscheint
        //die Taste E in einer Box...
        //TODO: wenn das hier^^^ nicht funktioniert einfach ein typ button spawnen mit @Spawns --wohl kaum aber lol
        return FXGL.entityBuilder(data)
                .type(INTERACTABLE)
                .bbox(new HitBox(BoundingShape.box(data.<Integer>get("width"), data.<Integer>get("height"))))
                .with(new CollidableComponent(true))    //ist das hier notwendig...? bruh
                .with("keyEntity", keyEntity)
                .buildAndAttach();  //kein physics component weil nur collision detection notwendig
    }
}
