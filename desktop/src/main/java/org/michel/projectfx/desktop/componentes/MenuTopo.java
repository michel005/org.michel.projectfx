package org.michel.projectfx.desktop.componentes;

import javafx.scene.layout.HBox;
import org.michel.utilitarios.FXMLUtils;

public class MenuTopo extends HBox {

    public static final MenuTopo INSTANCE = new MenuTopo();

    private MenuTopo() {
        FXMLUtils.load("/fxml/MenuTopo.fxml", this);
    }

}