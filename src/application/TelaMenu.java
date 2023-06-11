package application;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import ControleDeCadastro.MenuControleFrame;

public class TelaMenu extends JPanel {

    private JLabel tituloInicial;
    private JTextArea textoInicial;
    private JButton alunoButton;
    private JButton professorButton;
    private JButton disciplinaButton;
    private JButton sairButton;

    public TelaMenu() {
        super();
        this.setLayout(null);
        construcaoDoTitulo();
        construcaoDoTextoInformativo();

        buttonAluno();
        buttonProfessor();
        buttonDisciplina();

        buttonSair();

    }

    // Cria o título da tela
    public void construcaoDoTitulo() {
        tituloInicial = new JLabel("Seja-Bem(a) a tela de cadastro");
        tituloInicial.setBounds(30, 33, 380, 30);

        // Definindo a fonte do texto
        Font fonte = new Font("makinglovem", Font.BOLD, 26);
        tituloInicial.setFont(fonte);

        add(tituloInicial);
    }

    // Cria o texto informativo
    public void construcaoDoTextoInformativo() {
        textoInicial = new JTextArea();
        textoInicial.setBounds(30, 74, 603, 245);
        textoInicial.setText("Título: Tela de Cadastro de Escola\n\n" +
                "Descrição:\n\n" +
                "   A tela de cadastro de uma escola oferece uma interface intuitiva e amigável para inserir informações essenciais sobre alunos, professores e disciplinas.\n"
                +
                "   A tela apresenta campos para preenchimento de dados dos alunos, professores e disciplinas, facilitando o registro e a organização das informações na escola.\n"
                +
                "   Além disso, a tela pode incluir botões para enviar os dados do formulário e limpar os campos preenchidos.\n"
                +
                "   Essa tela de cadastro visa auxiliar na administração das atividades educacionais dentro da escola.");
        textoInicial.setEditable(false);
        textoInicial.setLineWrap(true);
        textoInicial.setWrapStyleWord(true);
        Font fonteTexto = new Font("Arial", Font.PLAIN, 14);
        textoInicial.setFont(fonteTexto);
        add(textoInicial);
    }

    // Cria o botão de cadastro de aluno
    public void buttonAluno() {
        alunoButton = new JButton("Cadastrar Aluno");
        alunoButton.setBounds(30, 335, 165, 30);

        // Adicionar ouvinte de ação ao botão
        alunoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chame a função irParaTelaAluno() da classe MenuControleFrame
                MenuControleFrame.irParaTelaAluno();
            }
        });
        add(alunoButton);
    }

    // Cria o botão de cadastro de professor
    public void buttonProfessor() {
        professorButton = new JButton("Cadastrar Professor");
        professorButton.setBounds(30, 376, 165, 30);

        professorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuControleFrame.irParaTelaProfessor();
            }
        });
        add(professorButton);
    }

    // Cria o botão de cadastro de disciplina
    public void buttonDisciplina() {
        disciplinaButton = new JButton("Cadastrar Disciplina");
        disciplinaButton.setBounds(30, 417, 165, 30);
        disciplinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuControleFrame.irParaTelaDisciplina();
            }
        });
        add(disciplinaButton);
    }

    // Cria o botão de sair
    public void buttonSair() {
        sairButton = new JButton("Sair da tela de cadastro");
        sairButton.setBounds(588, 513, 217, 30);
        add(sairButton);

        // Adicionar ActionListener ao botão de sair
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chamar o método para sair do programa
                sairDoPrograma();
            }
        });
    }

    // Método para sair do programa
    public void sairDoPrograma() {
        // Fechar o JFrame (ou outra janela principal do programa) para encerrar o
        // programa
        Window window = SwingUtilities.getWindowAncestor(this); // Obtém a janela atual a partir do JPanel
        if (window instanceof JFrame) {
            JFrame frame = (JFrame) window;
            frame.dispose(); // Fecha o JFrame
        }
    }

}
