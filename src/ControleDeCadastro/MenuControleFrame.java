package ControleDeCadastro;

import application.JFrameTelaMenu;
import visao.Frame;

public class MenuControleFrame {

    public static MenuControleFrame menuControleFrame;
    public static JFrameTelaMenu jfMenu;

    public static MenuControleFrame getIntance() {
        if (menuControleFrame == null) {
            menuControleFrame = new MenuControleFrame();
        }
        return menuControleFrame;
    }

    public void funcInt() {
        jfMenu = new JFrameTelaMenu();
    }
}
