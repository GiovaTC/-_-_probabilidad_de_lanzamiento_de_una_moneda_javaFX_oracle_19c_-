module com.example.probabilidad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.probabilidad to javafx.fxml;
    exports com.example.probabilidad;
}