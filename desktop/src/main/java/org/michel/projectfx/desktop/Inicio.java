package org.michel.projectfx.desktop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.michel.projectfx.desktop.paineis.PainelPrincipal;

public class Inicio extends Application {

    public static void main(String...args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(PainelPrincipal.INSTANCE, 1280.0, 768.0));
        stage.setTitle("ProjectFX - Gestão de Projetos");
        stage.centerOnScreen();
        stage.show();
    }

}