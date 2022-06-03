package de.prog2.uwupatch1;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;

public class DungeonApp extends GameApplication {

    //TODO: rausfinden wie wir diesen müll zusammen mit FirstStage.java starten wenn beide klassen erben müssen und deswegen nicht zsm sein können
    private Entity player;

    @Override
    protected void initSettings(GameSettings settings){
        settings.setWidth(1280);
        settings.setHeight(720);
    }

    @Override
    protected void initGame() {
        super.initGame();
        FXGL.getGameWorld().addEntityFactory(new Factory());
        FXGL.setLevelFromMap("tmx\\derDungeon.tmx");
    }

    @Override
    protected void initInput(){
        //FIXME: bisher echt kaputt die scheiße hilfe man!!!!
//        FXGL.getInput().addAction(new UserAction("Interact") {
//            @Override
//            protected void onActionBegin() {
//                getGameWorld().getEntitiesByType(INTERACTABLE)
//                        .stream()
//                        .filter(btn -> player.isColliding(btn))
//                        .forEach(btn -> {
//                            System.out.println("mit event interagiert");    //hier die aktion einbauen
//                        });                                                 //in FXGL nur über hardcode möglich.
//            }
//        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
