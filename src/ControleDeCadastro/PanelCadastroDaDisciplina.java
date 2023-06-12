package ControleDeCadastro;

import javax.swing.JOptionPane;

import InforCadastro.DadosDaDisciplina;

public class PanelCadastroDaDisciplina {
    private DadosDaDisciplina dadosDaDisciplina;

    public PanelCadastroDaDisciplina() {
        this.dadosDaDisciplina = new DadosDaDisciplina();
    }

    public void cadastrarDisciplinaText(String disciplina, String professorDaDisciplina, String matriculaDisiciplina,
            double horasDaDisciplina) {

        dadosDaDisciplina.setDisciplina(disciplina);
        dadosDaDisciplina.setProfessorDaDisciplina(professorDaDisciplina);
        dadosDaDisciplina.setMatriculaDisiciplina(matriculaDisiciplina);
        dadosDaDisciplina.setHorasDaDisciplina(horasDaDisciplina);

        String mensagem = dadosDaDisciplina.salvarTxt();

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
