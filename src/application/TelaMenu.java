package application;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


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
        buttonAluno();
        buttonProfessor();
        buttonDisciplina();
        buttonSair();
        contrucaoDoTextoInformativo();
    }

    public void construcaoDoTitulo() {
        tituloInicial = new JLabel("Seja-Bem(a) a tela de cadastro");
        tituloInicial.setBounds(30, 33, 351, 30);

        // Definindo a fonte do texto
        Font fonte = new Font("makinglovem", Font.BOLD, 26);
        tituloInicial.setFont(fonte);

        add(tituloInicial);
    }
    
    public void contrucaoDoTextoInformativo() {
        textoInicial = new JTextArea();
        textoInicial.setBounds(30, 74, 603, 245);
        textoInicial.setText("Título: Tela de Cadastro de Escola\n\n" +
                "Descrição:\n\n" +
                "A tela de cadastro de uma escola oferece uma interface intuitiva e amigável para inserir informações essenciais sobre alunos, professores e disciplinas.\n" +
                "A tela apresenta campos para preenchimento de dados dos alunos, professores e disciplinas, facilitando o registro e a organização das informações na escola.\n" +
                "Além disso, a tela pode incluir botões para enviar os dados do formulário e limpar os campos preenchidos.\n" +
                "Essa tela de cadastro visa auxiliar na administração das atividades educacionais dentro da escola.");
        textoInicial.setEditable(false);
        textoInicial.setLineWrap(true);
        textoInicial.setWrapStyleWord(true);
        Font fonteTexto = new Font("Arial", Font.PLAIN, 14);
        textoInicial.setFont(fonteTexto);
        add(textoInicial);
    }


    public void buttonAluno() {

        JButton alunoButton = new JButton("Cadastrar Aluno");
        alunoButton.setBounds(30, 335, 165, 30);
        add(alunoButton);
    }
    
    
    public void buttonProfessor() {
    	
    	JButton professorButton = new JButton("Cadastrar Professor");
    	professorButton.setBounds(30, 376, 165, 30);
        add(professorButton);
    }
    
    public void buttonDisciplina() {
    	
    	JButton disciplinaButton = new JButton("Cadastrar Disciplina");
    	disciplinaButton.setBounds(30, 417, 165, 30);
        add(disciplinaButton);
        
    }
    
    public void buttonSair() {
    	
    	JButton sairButton = new JButton("Sair da tela de cadastro");
    	sairButton.setBounds(588, 513, 217, 30);
        add(sairButton);
       
    }
}
