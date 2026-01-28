package com.example.probabilidad.ui;

import com.example.probabilidad.dao.ProbabilidadDAO;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.probabilidad.model.Probabilidad;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        Label titulo = new Label("Probabilidad - lanzamiento de moneda");
        Label resultado = new Label("resultado: ");

        Button btnCalcular = new Button("calcular Probabilidad");

        btnCalcular.setOnAction(e -> {
            try {
                double probabilidad = 0.5;;

                resultado.setText(
                        "Resultado: probabilidad de que 'cara' quede hacia abajo = 50%"
                );

                Probabilidad p = new Probabilidad(
                        "cara hacia abajo",
                        probabilidad
                );

                new ProbabilidadDAO().insertar(p);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Registro exitoso");
                alert.setHeaderText(null);
                alert.setContentText("resultado almacenado en oracle 19c");
                alert.show();
            } catch (Exception ex) {
                ex.printStackTrace();
                new Alert(Alert.AlertType.ERROR, ex.getMessage()).show();
            }
        });

        VBox root = new VBox(15, titulo, resultado, btnCalcular);
        root.setPadding(new Insets(20));

        stage.setTitle("probabilidad de moneda");
        stage.setScene(new Scene(root, 420, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
