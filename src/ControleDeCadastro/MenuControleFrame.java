package ControleDeCadastro;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import application.JFrameTelaMenu;
import application.TelaMenu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MenuControleFrame {

    public static MenuControleFrame menuControleFrame = null;
    public static TelaMenu tMenu;
    public static JFrameTelaMenu jfMenu;

    public MenuControleFrame() {

    }

    public static MenuControleFrame getIntance() {
        // Verifica se a instância do MenuControleFrame já existe
        if (menuControleFrame == null) {
            // Cria uma nova instância caso não exista
            menuControleFrame = new MenuControleFrame();
        }
        // Retorna a instância do MenuControleFrame
        return menuControleFrame;
    }

    public void funcInt() {
        // Cria a instância do JFrameTelaMenu
        jfMenu = new JFrameTelaMenu();

        // Cria a instância do TelaMenu
        tMenu = new TelaMenu();
    }

    public void telaDoMenu() {
        // Executa a criação e exibição da janela do menu na thread de despacho de
        // eventos do Swing
        SwingUtilities.invokeLater(() -> {

            // Cria a instância do TelaMenu com a sobreescrita do paintComponent para
            // desenhar o degradê
            tMenu = new TelaMenu() {
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    int altura = getHeight();
                    GradientPaint gradient = new GradientPaint(0, 0, Color.decode("#02AABD"), 0, altura,
                            Color.decode("#00CDAC"));
                    g2d.setPaint(gradient);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            };

            // Adiciona a instância de TelaMenu como conteúdo do JFrameTelaMenu
            jfMenu.getContentPane().add(tMenu);

            // Configura o fechamento da janela quando o botão de fechar é clicado
            jfMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Centraliza a janela na tela
            jfMenu.setLocationRelativeTo(null);

            // Torna a janela visível
            jfMenu.setVisible(true);
        });
    }

}
