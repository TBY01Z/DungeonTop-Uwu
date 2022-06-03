package de.prog2.uwupatch1.View;

import de.prog2.uwupatch1.Model.Collectables.InputClass;
import de.prog2.uwupatch1.contoller.MadeCharacterStageController;
import de.prog2.uwupatch1.contoller.SettingStageControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstStage extends Application {

    //    private static int resWidth;
    //    private static int resHeight;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FirstStage.class.getResource("StartStage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), SettingStageControl.WIDTH(), SettingStageControl.HIGHT());
        stage.setTitle("DungeonTop UWU");
        stage.setFullScreenExitHint("");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        if(InputClass.inputFill()){
            Application.launch(FirstStage.class, args);
        }
    }
}
    /**

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StartStage.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("");
        stage.setTitle("DungeonTop UWU");
        stage.setScene(scene);
//        ViewManager vm = new ViewManager();
//        ViewManager.setHeight(720);
//      public static void main(String[] args) {
    //        if(InputClass.inputFill()){
    //            Application.launch(FirstStage.class, args);
    //        }
    //    }  ViewManager.setWidth(1280);       //so könnte man die einstellungen ändern
//        ViewManager.setFullscreen(true);    //TODO: grafische einstellungen in der UI implementieren mit menüs und so
 //       stage = vm.getMainStage();
        stage.show();
    }



}*/