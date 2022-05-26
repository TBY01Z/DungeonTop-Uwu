module com.prog.uwupatch {
    requires javafx.fxml;

    requires javafx.graphics;
    requires javafx.base;

    opens com.prog2.uwupatch1 to javafx.fxml;
    exports com.prog2.uwupatch1;
    opens com.prog2.uwupatch1.View to javafx.fxml;
    exports com.prog2.uwupatch1.Control;
    opens com.prog2.uwupatch1.Control to javafx.fxml;
    exports com.prog2.uwupatch1.View;
}