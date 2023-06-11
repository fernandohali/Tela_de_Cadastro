package application;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TelaDoDisciplina extends JPanel {

	private JLabel tituloDisciplina;
	private JButton sairButton;

	public TelaDoDisciplina() {
		super();
		this.setLayout(null);
		tituloDoDisciplina();
		buttonSair();
	}

	public void tituloDoDisciplina() {
		JLabel tituloDisciplina = new JLabel("Cadastro Do Disciplina");
		tituloDisciplina.setBounds(23, 21, 304, 27);
		Font fonte = new Font("makinglovem", Font.BOLD, 26);
		tituloDisciplina.setFont(fonte);
		add(tituloDisciplina);

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
