package application;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import ControleDeCadastro.MenuControleFrame;
import ControleDeCadastro.PanelCadastroDoProfessor;

public class TelaDoProfessor extends JPanel {

	private JLabel tituloProfessor;
	private JButton voltarMenu;
	private JButton cadastrarProfessor;

	private JTextField nomeDoProfessor;
	private JSpinner idadeDoProfessor;
	private JComboBox<String> sexo;
	private JTextField telefoneDoProfessor;
	private JTextField disciplinaDoProfessor;

	public TelaDoProfessor() {
		super();
		this.setLayout(null);

		this.add(getTextFildNomeDoProfessor());
		this.add(getTextFieldIdadeDoProfessor());
		this.add(getComboBoxSexo());
		this.add(getTextFildDisciplinaDoProfessor());
		this.add(getTextFildTelefoneDoProfessor());

		tituloDoProfessor();
		buttonVoltarMenu();
		titulosDosCampos();
		buttonCadastrar();

	}

	public void tituloDoProfessor() {
		tituloProfessor = new JLabel("Cadastro do Professor(a)");
		tituloProfessor.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloProfessor.setFont(fonte);
		add(tituloProfessor);

	}

	public void titulosDosCampos() {

		JLabel TituloNomeDoAluno = new JLabel("Nome do Professor(a)");
		TituloNomeDoAluno.setBounds(10, 74, 120, 14);
		add(TituloNomeDoAluno);

		JLabel TituloIdadeDoAluno = new JLabel("Idade do Professor(a)");
		TituloIdadeDoAluno.setBounds(10, 140, 98, 31);
		add(TituloIdadeDoAluno);

		JLabel TituloSexoDoAluno = new JLabel("Sexo do Professor(a)");
		TituloSexoDoAluno.setBounds(10, 212, 98, 31);
		add(TituloSexoDoAluno);

		JLabel TituloDiscipla = new JLabel("Discipla do Professor(a)");
		TituloDiscipla.setBounds(10, 283, 136, 31);
		add(TituloDiscipla);

		JLabel TituloTelefone = new JLabel("Telefone do Professor(a)");
		TituloTelefone.setBounds(10, 355, 136, 31);
		add(TituloTelefone);

	}

	public JTextField getTextFildNomeDoProfessor() {
		// Verifica se o objeto JTextField já foi criado
		if (nomeDoProfessor == null) {
			// Cria um novo objeto JTextField
			nomeDoProfessor = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			nomeDoProfessor.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			nomeDoProfessor.setBounds(10, 99, 276, 30);
		}

		// Retorna o objeto JTextField
		return nomeDoProfessor;
	}

	public JTextField getTextFildDisciplinaDoProfessor() {
		// Verifica se o objeto JTextField já foi criado
		if (disciplinaDoProfessor == null) {
			// Cria um novo objeto JTextField
			disciplinaDoProfessor = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			disciplinaDoProfessor.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			disciplinaDoProfessor.setBounds(10, 314, 136, 30);
		}

		// Retorna o objeto JTextField
		return disciplinaDoProfessor;
	}

	public JSpinner getTextFieldIdadeDoProfessor() {
		// Verifica se o objeto JSpinner já foi criado
		if (idadeDoProfessor == null) {
			// Cria um novo objeto SpinnerNumberModel para aceitar apenas números inteiros
			SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);

			// Cria um novo objeto JSpinner com o SpinnerNumberModel
			idadeDoProfessor = new JSpinner(spinnerModel);

			// Obtém o componente de editor do JSpinner para personalizar seu estilo
			JComponent editor = idadeDoProfessor.getEditor();
			JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();

			// Configura o alinhamento do texto para a esquerda
			textField.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JSpinner
			idadeDoProfessor.setBounds(10, 171, 109, 30);
		}

		// Retorna o objeto JSpinner
		return idadeDoProfessor;
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

	public JTextField getTextFildTelefoneDoProfessor() {

		if (telefoneDoProfessor == null) {

			// Cria um novo objeto JTextField
			telefoneDoProfessor = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			telefoneDoProfessor.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			telefoneDoProfessor.setBounds(10, 385, 109, 30);
		}

		// Retorna o objeto JTextField
		return telefoneDoProfessor;
	}

	public void buttonCadastrar() {
		// Criação do botão "Cadastrar aluno"
		cadastrarProfessor = new JButton("Cadastrar aluno(a)");

		// Define a posição e o tamanho do botão
		cadastrarProfessor.setBounds(10, 555, 166, 30);

		// Adiciona um ActionListener ao botão
		cadastrarProfessor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				PanelCadastroDoProfessor ControleDeCadastro = new PanelCadastroDoProfessor();

				// Lógica para cadastrar o aluno
				String nomeP = nomeDoProfessor.getText();
				String idadeP = (String) idadeDoProfessor.getValue();
				String sexoP = (String) sexo.getSelectedItem();
				String telefoneDoP = telefoneDoProfessor.getText();
				String disciplinaP = disciplinaDoProfessor.getText();

				if (nomeP.isEmpty() || idadeP.isEmpty() || sexoP.isEmpty() || telefoneDoP.isEmpty()
						|| disciplinaP.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos.");

				} else {
					// Lógica para cadastrar o aluno
					// ...

					ControleDeCadastro.cadastrarProfessorText(nomeP, idadeP, sexoP, disciplinaP, telefoneDoP);

					// Limpa os campos de entrada de dados
					nomeDoProfessor.setText("");
					idadeDoProfessor.setValue(0);
					sexo.setSelectedIndex(0);
					telefoneDoProfessor.setText("");
					disciplinaDoProfessor.setText("");

					MenuControleFrame.telaDoMenu();
				}

			}

		});

		// Adiciona o botão ao componente atual
		add(cadastrarProfessor);
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
