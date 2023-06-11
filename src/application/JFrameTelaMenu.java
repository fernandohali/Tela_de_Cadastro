package application;

import javax.swing.JFrame;

public class JFrameTelaMenu extends JFrame {

    public Object getContentPane;

    public JFrameTelaMenu() {

        setTitle("Tela de cadastro da escola");

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Define a janela para maximizada

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
