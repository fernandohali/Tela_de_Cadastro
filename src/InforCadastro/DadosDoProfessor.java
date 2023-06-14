package InforCadastro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DadosDoProfessor {

    private String nomeDoProfessor;
    private String idadeDoProfessor;
    private String sexoDoProfessor;
    private String DisciplinaDoprofessor;
    private String telefoneDoProfessor;

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getIdadeDoProfessor() {
        return idadeDoProfessor;
    }

    public void setIdadeDoProfessor(String idadeDoProfessor) {
        this.idadeDoProfessor = idadeDoProfessor;
    }

    public String getSexoDoProfessor() {
        return sexoDoProfessor;
    }

    public void setSexoDoProfessor(String sexoDoProfessor) {
        this.sexoDoProfessor = sexoDoProfessor;
    }

    public String getDisciplinaDoprofessor() {
        return DisciplinaDoprofessor;
    }

    public void setDisciplinaDoprofessor(String disciplinaDoprofessor) {
        DisciplinaDoprofessor = disciplinaDoprofessor;
    }

    public String getTelefoneDoProfessor() {
        return telefoneDoProfessor;
    }

    public void setTelefoneDoProfessor(String telefoneDoProfessor) {
        this.telefoneDoProfessor = telefoneDoProfessor;
    }

    public String salvarTxt() {

        try {
            FileWriter fw = new FileWriter("professor(a).txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("\nInformações do cadastro Professor(a)");
            pw.println("Nome: " + this.nomeDoProfessor);
            pw.println("Idade: " + this.idadeDoProfessor);
            pw.println("Sexo: " + this.sexoDoProfessor);
            pw.println("Matrícula: " + this.DisciplinaDoprofessor);
            pw.println("Telefone: " + this.telefoneDoProfessor);

            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Cadastro confirmado";
    }

}
