package ControleDeCadastro;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import application.JFrameTelaMenu;
import application.TelaDoAluno;
import application.TelaDoDisciplina;
import application.TelaDoProfessor;
import application.TelaMenu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MenuControleFrame {

    public static MenuControleFrame menuControleFrame = null;

    public static TelaMenu tMenu;
    public static JFrameTelaMenu jfMenu;
    public static TelaDoAluno tAluno;
    public static TelaDoProfessor tProfessor;
    public static TelaDoDisciplina tDisciplina;

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

        // Cria a instância da TelaDoAluno
        tAluno = new TelaDoAluno();

        // Cria a instância da TelaDoDisciplina
        tDisciplina = new TelaDoDisciplina();

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

            // Limpa o conteúdo anterior do jfMenu
            jfMenu.getContentPane().removeAll();
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

    public static void irParaTelaAluno() {

        // Executa a criação e exibição da janela do menu na thread de despacho de
        // eventos do Swing
        SwingUtilities.invokeLater(() -> {

            // Cria a instância do TelaMenu com a sobreescrita do paintComponent para
            // desenhar o degradê
            tAluno = new TelaDoAluno() {
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

            // Limpa o conteúdo anterior do jfMenu
            jfMenu.getContentPane().removeAll();

            // Adiciona o tDisciplina ao jfMenu
            jfMenu.getContentPane().add(tAluno);
            jfMenu.setTitle("Cadastrar Aluno(a)");

            // Configura o fechamento da janela quando o botão de fechar é clicado
            jfMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Torna a janela visível
            jfMenu.setVisible(true);

        });
    }

    public static void irParaTelaProfessor() {

        SwingUtilities.invokeLater(() -> {
            // Cria a instância do TelaMenu com a sobreescrita do paintComponent para
            // desenhar o degradê
            tProfessor = new TelaDoProfessor() {
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

            // Limpa o conteúdo anterior do jfMenu
            jfMenu.getContentPane().removeAll();

            // Adiciona o tProfessor ao jfMenu
            jfMenu.getContentPane().add(tProfessor);
            jfMenu.setTitle("Cadastrar Professor(a)");

            // Configura o fechamento da janela quando o botão de fechar é clicado
            jfMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Torna a janela visível
            jfMenu.setVisible(true);
        });

    }

    public static void irParaTelaDisciplina() {

        SwingUtilities.invokeLater(() -> {
            // Cria a instância do TelaMenu com a sobreescrita do paintComponent para
            // desenhar o degradê
            tDisciplina = new TelaDoDisciplina() {
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

            // Limpa o conteúdo anterior do jfMenu
            jfMenu.getContentPane().removeAll();

            // Adiciona o tDisciplina ao jfMenu
            jfMenu.getContentPane().add(tDisciplina);
            jfMenu.setTitle("Cadastrar Disciplina(a)");

            // Configura o fechamento da janela quando o botão de fechar é clicado
            jfMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            // Torna a janela visível
            jfMenu.setVisible(true);
        });

    }
}
