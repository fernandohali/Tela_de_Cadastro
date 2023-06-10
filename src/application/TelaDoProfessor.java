package application;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaDoProfessor extends JPanel {

	private JLabel tituloProfessor;

	/**
	 * Create the panel.
	 */
	public TelaDoProfessor() {
		super();
		this.setLayout(null);
		tituloDoProfessor();
	}

	public void tituloDoProfessor() {
		JLabel tituloProfessor = new JLabel("Cadastro do Professor");
		tituloProfessor.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloProfessor.setFont(fonte);
		add(tituloProfessor);

	}
}
