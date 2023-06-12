package application;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ControleDeCadastro.MenuControleFrame;

public class TelaDoDisciplina extends JPanel {

	private JLabel tituloDisciplina;
	private JButton voltarMenu;

	public TelaDoDisciplina() {
		super();
		this.setLayout(null);
		tituloDoDisciplina();
		buttonVoltarMenu();

	}

	public void tituloDoDisciplina() {
		tituloDisciplina = new JLabel("Cadastro Do Disciplina");
		tituloDisciplina.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloDisciplina.setFont(fonte);
		add(tituloDisciplina);

	}

	public void buttonVoltarMenu() {

		voltarMenu = new JButton("Voltar para MENU");
		voltarMenu.setBounds(26, 513, 217, 30);
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
