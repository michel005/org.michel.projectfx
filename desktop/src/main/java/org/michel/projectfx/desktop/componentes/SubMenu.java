package org.michel.projectfx.desktop.componentes;

import javafx.scene.layout.HBox;
import org.michel.utilitarios.FXMLUtils;

public class SubMenu extends HBox {

    public static final SubMenu INSTANCE = new SubMenu();

    private SubMenu() {
        FXMLUtils.load("/fxml/SubMenu.fxml", this);
    }

}