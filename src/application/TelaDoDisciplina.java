package application;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import ControleDeCadastro.MenuControleFrame;
import ControleDeCadastro.PanelCadastroDaDisciplina;

public class TelaDoDisciplina extends JPanel {

	private JLabel tituloDisciplina;
	private JButton voltarMenu;
	private JButton cadastrarDisciplina;

	private JTextField nomeDaDisciplina;
	private JTextField nomeDoProfessorNaDisciplina;
	private JSpinner cargaHoraria;
	private JTextField matriculaDaDisciplina;

	public TelaDoDisciplina() {
		super();
		this.setLayout(null);

		this.add(getTextFildNomeDaDisciplina());
		this.add(getTextFildNomeDoProfessorNaDisciplina());
		this.add(getTextFieldCargaHoraria());
		this.add(getTextFildMatriculaDaDisciplina());

		tituloDoDisciplina();
		buttonVoltarMenu();
		buttonCadastrar();
		titulosDosCampos();

	}

	public void tituloDoDisciplina() {
		tituloDisciplina = new JLabel("Cadastro da Disciplina");
		tituloDisciplina.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloDisciplina.setFont(fonte);
		add(tituloDisciplina);

	}

	public void titulosDosCampos() {

		JLabel TituloNomeDaDisciplina = new JLabel("Nome da disciplina");
		TituloNomeDaDisciplina.setBounds(10, 74, 120, 14);
		add(TituloNomeDaDisciplina);

		JLabel TituloIdadeDaDisciplina = new JLabel("Professor(a) da disciplina");
		TituloIdadeDaDisciplina.setBounds(10, 140, 136, 31);
		add(TituloIdadeDaDisciplina);

		JLabel TituloSexoDoAluno = new JLabel("Matricula da disciplina");
		TituloSexoDoAluno.setBounds(10, 212, 136, 31);
		add(TituloSexoDoAluno);

		JLabel TituloDiscipla = new JLabel("Horas da disciplina");
		TituloDiscipla.setBounds(10, 283, 136, 31);
		add(TituloDiscipla);

	}

	public JTextField getTextFildNomeDaDisciplina() {
		// Verifica se o objeto JTextField já foi criado
		if (nomeDaDisciplina == null) {
			// Cria um novo objeto JTextField
			nomeDaDisciplina = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			nomeDaDisciplina.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			nomeDaDisciplina.setBounds(10, 99, 276, 30);
		}

		// Retorna o objeto JTextField
		return nomeDaDisciplina;
	}

	public JTextField getTextFildNomeDoProfessorNaDisciplina() {
		// Verifica se o objeto JTextField já foi criado
		if (nomeDoProfessorNaDisciplina == null) {
			// Cria um novo objeto JTextField
			nomeDoProfessorNaDisciplina = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			nomeDoProfessorNaDisciplina.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			nomeDoProfessorNaDisciplina.setBounds(10, 171, 276, 30);
		}

		// Retorna o objeto JTextField
		return nomeDoProfessorNaDisciplina;
	}

	public JSpinner getTextFieldCargaHoraria() {
		// Verifica se o objeto JSpinner já foi criado
		if (cargaHoraria == null) {
			// Cria um novo objeto SpinnerNumberModel para aceitar apenas números inteiros
			SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1);

			// Cria um novo objeto JSpinner com o SpinnerNumberModel
			cargaHoraria = new JSpinner(spinnerModel);

			// Obtém o componente de editor do JSpinner para personalizar seu estilo
			JComponent editor = cargaHoraria.getEditor();
			JFormattedTextField textField = ((JSpinner.DefaultEditor) editor).getTextField();

			// Configura o alinhamento do texto para a esquerda
			textField.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JSpinner
			cargaHoraria.setBounds(10, 314, 109, 30);
		}

		// Retorna o objeto JSpinner
		return cargaHoraria;
	}

	public JTextField getTextFildMatriculaDaDisciplina() {
		// Verifica se o objeto JTextField já foi criado
		if (matriculaDaDisciplina == null) {
			// Cria um novo objeto JTextField
			matriculaDaDisciplina = new JTextField();

			// Configura o alinhamento do texto para a esquerda
			matriculaDaDisciplina.setHorizontalAlignment(SwingConstants.LEFT);

			// Define a posição e o tamanho do JTextField
			matriculaDaDisciplina.setBounds(10, 242, 276, 30);
		}

		// Retorna o objeto JTextField
		return matriculaDaDisciplina;
	}

	public void buttonCadastrar() {
		// Criação do botão "Cadastrar aluno"
		cadastrarDisciplina = new JButton("Cadastrar Disciplina(a)");

		// Define a posição e o tamanho do botão
		cadastrarDisciplina.setBounds(10, 555, 166, 30);

		// Adiciona o botão ao componente atual
		add(cadastrarDisciplina);

		// Adiciona um ActionListener ao botão
		cadastrarDisciplina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PanelCadastroDaDisciplina ControleDeCadastro = new PanelCadastroDaDisciplina();

				String nome = nomeDaDisciplina.getText();
				String nomeprofessor = nomeDoProfessorNaDisciplina.getText();
				String cargahoraria = (String) cargaHoraria.getToolTipText();
				String martricula = (String) matriculaDaDisciplina.getText();

				ControleDeCadastro.cadastrarDisciplinaText(nome, nomeprofessor, cargahoraria, martricula);

			}
		});
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
