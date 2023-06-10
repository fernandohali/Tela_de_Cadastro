package application;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaDoDisciplina extends JPanel {

	private JLabel tituloDisciplina;

	/**
	 * Create the panel.
	 */
	public TelaDoDisciplina() {

		super();
		this.setLayout(null);
		tituloDoDisciplina();
	}

	public void tituloDoDisciplina() {
		JLabel tituloDisciplina = new JLabel("Cadastro Do Aluno");
		tituloDisciplina.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloDisciplina.setFont(fonte);
		add(tituloDisciplina);

	}
}
