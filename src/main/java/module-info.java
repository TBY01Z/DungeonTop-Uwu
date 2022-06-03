module com.prog.uwupatch {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;


    opens de.prog2.uwupatch1.View to javafx.fxml;
    exports de.prog2.uwupatch1.View;
    opens de.prog2.uwupatch1.contoller to javafx.fxml;
    exports de.prog2.uwupatch1.contoller;
    opens de.prog2.uwupatch1.Model.Database to javafx.fxml;
    exports de.prog2.uwupatch1.Model.Database;
    opens de.prog2.uwupatch1.Model.Cards to javafx.fxml;
    exports de.prog2.uwupatch1.Model.Cards;
    opens de.prog2.uwupatch1.Model.PlayerAttachment to javafx.fxml;
    exports de.prog2.uwupatch1.Model.PlayerAttachment;
    opens de.prog2.uwupatch1.Model.Events to javafx.fxml;
    exports de.prog2.uwupatch1.Model.Events;
    opens de.prog2.uwupatch1.View.FXGL to javafx.fxml;
    exports de.prog2.uwupatch1.View.FXGL;

}