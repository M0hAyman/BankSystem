module com.example.bankui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires com.almasb.fxgl.all;

    opens com.example.bankui to javafx.fxml;
    exports com.example.bankui;
}