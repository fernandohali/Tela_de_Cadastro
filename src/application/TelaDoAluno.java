package application;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaDoAluno extends JPanel {

	private JLabel tituloAluno;

	public TelaDoAluno() {
		super();
		this.setLayout(null);
		tituloDoAluno();
	}

	public void tituloDoAluno() {
		JLabel tituloAluno = new JLabel("Cadastro Do Aluno");
		tituloAluno.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloAluno.setFont(fonte);
		add(tituloAluno);

	}
}
