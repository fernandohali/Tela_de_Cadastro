package ControleDeCadastro;

import javax.swing.JOptionPane;

import InforCadastro.DadosDoProfessor;

public class PanelCadastroDoProfessor {
    private DadosDoProfessor dadosDoProfessor;

    public PanelCadastroDoProfessor() {
        this.dadosDoProfessor = new DadosDoProfessor();
    }

    public void cadastrarProfessorText(String nomeP, String idadeP, String sexoP, String disciplinaP,
            String telefoneDoP) {
        dadosDoProfessor.setNomeDoProfessor(nomeP);
        dadosDoProfessor.setIdadeDoProfessor(idadeP);
        dadosDoProfessor.setSexoDoProfessor(sexoP);
        dadosDoProfessor.setDisciplinaDoprofessor(disciplinaP);
        dadosDoProfessor.setDisciplinaDoprofessor(telefoneDoP);

        String mensagem = dadosDoProfessor.salvarTxt();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
