package application;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMenu extends JPanel {

    private JLabel tituloInicial;

    public TelaMenu() {
        super();
        this.setLayout(null);
        construcaoDoTitulo();
    }

    public void construcaoDoTitulo() {
        tituloInicial = new JLabel("Seja-Bem a tela de cadastro");
        tituloInicial.setBounds(70, 80, 400, 30);

        // Definindo a fonte do texto
        Font fonte = new Font("makinglovem", Font.BOLD, 26);
        tituloInicial.setFont(fonte);

        add(tituloInicial);
    }
}
