package InforCadastro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DadosDoAluno {

    private String nomeDoAluno;
    private String idadeDoAluno;
    private String cpf;
    private String MatriculoDoAluno;
    private String sexoAluno;
    private String telefoneDoAluno;

    public DadosDoAluno(String nomeDoAluno, String idadeDoAluno, String cpf, String matriculoDoAluno, String sexoAluno,
            String telefoneDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
        this.idadeDoAluno = idadeDoAluno;
        this.cpf = cpf;
        MatriculoDoAluno = matriculoDoAluno;
        this.sexoAluno = sexoAluno;
        this.telefoneDoAluno = telefoneDoAluno;
    }

    public DadosDoAluno() {
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public String getIdadeDoAluno() {
        return idadeDoAluno;
    }

    public void setIdadeDoAluno(String idadeDoAluno) {
        this.idadeDoAluno = idadeDoAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatriculoDoAluno() {
        return MatriculoDoAluno;
    }

    public void setMatriculoDoAluno(String matriculoDoAluno) {
        MatriculoDoAluno = matriculoDoAluno;
    }

    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String getTelefoneDoAluno() {
        return telefoneDoAluno;
    }

    public void setTelefoneDoAluno(String telefoneDoAluno) {
        this.telefoneDoAluno = telefoneDoAluno;
    }

    public String salvarTxt() {

        try {
            FileWriter fw = new FileWriter("Aluno.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("\nInformações do cadastro aluno");
            pw.println("Nome: " + this.nomeDoAluno);
            pw.println("Idade: " + this.idadeDoAluno);
            pw.println("CPF: " + this.cpf);
            pw.println("Matrícula: " + this.MatriculoDoAluno);
            pw.println("Sexo: " + this.sexoAluno);
            pw.println("Telefone: " + this.telefoneDoAluno);

            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Cadastro confirmado";
    }

}
