module com.prog2.uwupatch1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.prog2.uwupatch1 to javafx.fxml;
    exports com.prog2.uwupatch1;
    opens com.prog2.uwupatch1.View to javafx.fxml;
    exports com.prog2.uwupatch1.Control;
    opens com.prog2.uwupatch1.Control to javafx.fxml;
    exports com.prog2.uwupatch1.View;
}