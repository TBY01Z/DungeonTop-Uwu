module com.prog.uwupatch {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;


    opens de.prog2.uwupatch1.View to javafx.fxml;
    exports de.prog2.uwupatch1.View;
    opens de.prog2.uwupatch1.contoller to javafx.fxml;
    exports de.prog2.uwupatch1.contoller;
    opens de.prog2.uwupatch1.Model.Collectables to javafx.fxml;
    exports de.prog2.uwupatch1.Model.Collectables;
    opens de.prog2.uwupatch1.Model.Items.Cards to javafx.fxml;
    exports de.prog2.uwupatch1.Model.Items.Cards;
    opens de.prog2.uwupatch1.Model.PlayerSelf to javafx.fxml;
    exports de.prog2.uwupatch1.Model.PlayerSelf;
    opens de.prog2.uwupatch1.Model.InGameEvents to javafx.fxml;
    exports de.prog2.uwupatch1.Model.InGameEvents;
    exports de.prog2.uwupatch1.Model.Items.PlayerAttachments;
    opens de.prog2.uwupatch1.Model.Items.PlayerAttachments to javafx.fxml;

}