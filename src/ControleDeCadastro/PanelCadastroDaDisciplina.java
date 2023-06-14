package ControleDeCadastro;

import javax.swing.JOptionPane;

import InforCadastro.DadosDaDisciplina;

public class PanelCadastroDaDisciplina {
    private DadosDaDisciplina dadosDaDisciplina;

    public PanelCadastroDaDisciplina() {
        this.dadosDaDisciplina = new DadosDaDisciplina();
    }

    public void cadastrarDisciplinaText(String disciplina, String professorDaDisciplina, String matriculaDisiciplina,
            String martricula) {

        dadosDaDisciplina.setDisciplina(disciplina);
        dadosDaDisciplina.setProfessorDaDisciplina(professorDaDisciplina);
        dadosDaDisciplina.setMatriculaDisiciplina(matriculaDisiciplina);
        dadosDaDisciplina.setHorasDaDisciplina(martricula);

        String mensagem = dadosDaDisciplina.salvarTxt();

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
