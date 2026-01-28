module com.example.probabilidad {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    exports com.example.probabilidad.ui;
    opens com.example.probabilidad.ui to javafx.fxml;
}
