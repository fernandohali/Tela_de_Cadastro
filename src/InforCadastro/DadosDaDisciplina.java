package InforCadastro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DadosDaDisciplina {

    private String disciplina;
    private String professorDaDisciplina;
    private String matriculaDisiciplina;
    private String horasDaDisciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessorDaDisciplina() {
        return professorDaDisciplina;
    }

    public void setProfessorDaDisciplina(String professorDaDisciplina) {
        this.professorDaDisciplina = professorDaDisciplina;
    }

    public String getMatriculaDisiciplina() {
        return matriculaDisiciplina;
    }

    public void setMatriculaDisiciplina(String matriculaDisiciplina) {
        this.matriculaDisiciplina = matriculaDisiciplina;
    }

    public String getHorasDaDisciplina() {
        return horasDaDisciplina;
    }

    public void setHorasDaDisciplina(String martricula) {
        this.horasDaDisciplina = martricula;
    }

    public String salvarTxt() {

        try {
            FileWriter fw = new FileWriter("Disciplina.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("\nInformações do cadastra disciplina");
            pw.println("Nome da disciplina: " + this.disciplina);
            pw.println("Professor da disciplina: " + this.professorDaDisciplina);
            pw.println("Matrícula: " + this.matriculaDisiciplina);
            pw.println("Horas da disciplina: " + this.horasDaDisciplina);

            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Cadastro confirmado";
    }

}
