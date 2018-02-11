package org.michel.projectfx.desktop.paineis;

import javafx.scene.layout.VBox;
import org.michel.projectfx.desktop.componentes.MenuTopo;
import org.michel.projectfx.desktop.componentes.SubMenu;

public class PainelPrincipal extends VBox {

    public static final PainelPrincipal INSTANCE = new PainelPrincipal();

    private PainelPrincipal() {

        this.setStyle("-fx-background-color: #FFF;");
        this.getChildren().add(MenuTopo.INSTANCE);
        this.getChildren().add(SubMenu.INSTANCE);

    }

}