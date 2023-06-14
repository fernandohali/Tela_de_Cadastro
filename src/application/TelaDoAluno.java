package application;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;

import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import ControleDeCadastro.MenuControleFrame;
import ControleDeCadastro.PanelCadastroDoAluno;

import javax.swing.SwingConstants;

public class TelaDoAluno extends JPanel {

	private JLabel tituloAluno;
	private JButton voltarMenu;
	private JButton cadastrarAluno;

	private JTextField nomeDoAluno;
	private JSpinner idadeDoAluno;
	private JComboBox<String> sexo;
	private JTextField matriculaDoAluno;
	private JTextField cpfDoAluno;
	private JTextField telefoneDoAluno;

	public TelaDoAluno() {
		super();
		this.setLayout(null);
		tituloDoAluno();

		titulosDosCampos();

		// Campos do texto para o cadastro do Aluno.
		getTextFildNomeDoAluno();
		this.add(getTextFieldIdadeDoAluno());
		this.add(getComboBoxSexo());
		this.add(getTextFieldMatriculaDoAluno());
		this.add(getTextFildCpfDoAluno());
		this.add(getTextFildTelefoneDoAluno());
		buttonVoltarMenu();
		buttonCadastrar();
	}

	public void tituloDoAluno() {
		tituloAluno = new JLabel("Cadastro do aluno(a)");
		tituloAluno.setBounds(23, 21, 354, 30);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloAluno.setFont(fonte);
		add(tituloAluno);

	}

	public void titulosDosCampos() {

		JLabel TituloNomeDoAluno = new JLabel("Nome do aluno(a)");
		TituloNomeDoAluno.setBounds(10, 74, 120, 14);
		add(TituloNomeDoAluno);

		JLabel TituloIdadeDoAluno = new JLabel("Idade do aluno(a)");
		TituloIdadeDoAluno.setBounds(10, 140, 98, 31);
		add(TituloIdadeDoAluno);

		JLabel TituloSexoDoAluno = new JLabel("Sexo do aluno(a)");
		TituloSexoDoAluno.setBounds(10, 212, 98, 31);
		add(TituloSexoDoAluno);

		JLabel TituloMatricula = new JLabel("Matricula do aluno(a)");
		TituloMatricula.setBounds(10, 283, 136, 31);
		add(TituloMatricula);

		JLabel TituloCPF = new JLabel("CPF do aluno(a)");
		TituloCPF.setBounds(10, 355, 98, 31);
		add(TituloCPF);

		JLabel TituloTelefone = new JLabel("Telefone do aluno(a)");
		TituloTelefone.setBounds(10, 425, 120, 31);
		add(TituloTelefone);

	}

	public JTextField getTextFildNomeDoAluno() {
		// Verifica se o objeto JTextField já foi criado
		if (nomeDoAluno == null) {
			// Cria um novo objeto JTextField
			nomeDoAluno = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			nomeDoAluno.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			nomeDoAluno.setBounds(10, 99, 276, 30);
		}

		add(nomeDoAluno);
		// Retorna o objeto JTextField
		return nomeDoAluno;
	}

	public JSpinner getTextFieldIdadeDoAluno() {
		// Verifica se o objeto JSpinner já foi criado
		if (idadeDoAluno == null) {
			// Cria um novo objeto SpinnerNumberModel para aceitar apenas números inteiros
			SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);

			// Cria um novo objeto JSpinner com o SpinnerNumberModel
			idadeDoAluno = new JSpinner(spinnerModel);

			// Obtém o componente de editor do JSpinner para personalizar seu estilo
			JComponent editor = idadeDoAluno.getEditor();
			JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();

			// Configura o alinhamento do texto para a esquerda
			textField.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JSpinner
			idadeDoAluno.setBounds(10, 171, 109, 30);
		}

		// Retorna o objeto JSpinner
		return idadeDoAluno;
	}

	public JComboBox<String> getComboBoxSexo() {
		// Verifica se o objeto JComboBox já foi criado
		if (sexo == null) {
			// Cria um novo objeto JComboBox com as opções de sexo
			String[] opcoesSexo = { "Masculino", "Feminino" };
			sexo = new JComboBox<>(opcoesSexo);

			// Define a posição e o tamanho do JComboBox
			sexo.setBounds(10, 242, 109, 30);
		}

		// Retorna o objeto JComboBox
		return sexo;
	}

	public JTextField getTextFieldMatriculaDoAluno() {

		// Verifica se o objeto JTextField já foi criado
		if (matriculaDoAluno == null) {
			// Cria um novo objeto JTextField
			matriculaDoAluno = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			matriculaDoAluno.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			matriculaDoAluno.setBounds(10, 314, 109, 30);
		}

		// Retorna o objeto JTextField
		return matriculaDoAluno;

	}

	public JTextField getTextFildCpfDoAluno() {

		if (cpfDoAluno == null) {

			// Cria um novo objeto JTextField
			cpfDoAluno = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			cpfDoAluno.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			cpfDoAluno.setBounds(10, 384, 109, 30);
		}

		// Retorna o objeto JTextField
		return cpfDoAluno;
	}

	public JTextField getTextFildTelefoneDoAluno() {

		if (telefoneDoAluno == null) {

			// Cria um novo objeto JTextField
			telefoneDoAluno = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			telefoneDoAluno.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			telefoneDoAluno.setBounds(10, 453, 109, 30);
		}

		// Retorna o objeto JTextField
		return telefoneDoAluno;
	}

	public void buttonCadastrar() {
		// Criação do botão "Cadastrar aluno"
		cadastrarAluno = new JButton("Cadastrar aluno(a)");

		// Define a posição e o tamanho do botão
		cadastrarAluno.setBounds(10, 555, 166, 30);

		// Adiciona um ActionListener ao botão
		cadastrarAluno.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				PanelCadastroDoAluno ControleDeCadastro = new PanelCadastroDoAluno();

				String nome = nomeDoAluno.getText();
				String idade = (String) idadeDoAluno.getToolTipText();
				String sexoA = (String) sexo.getSelectedItem();
				String matricula = matriculaDoAluno.getText();
				String cpf = cpfDoAluno.getText();
				String telefone = telefoneDoAluno.getText();

				try {
					ControleDeCadastro.cadastrarAlunoText(nome, idade, cpf, matricula, sexoA, telefone);
				} catch (IOException e1) {

					e1.printStackTrace();
				}

				MenuControleFrame.telaDoMenu();
			}

		});

		// Adiciona o botão ao componente atual
		add(cadastrarAluno);
	}

	protected void escreverDadosEmArquivo(PanelCadastroDoAluno controleDeCadastro) {
	}

	public void buttonVoltarMenu() {

		voltarMenu = new JButton("Voltar para MENU");
		voltarMenu.setBounds(10, 623, 217, 30);
		add(voltarMenu);

		voltarMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MenuControleFrame.telaDoMenu();
			}
		});

		add(voltarMenu);
	}
}
