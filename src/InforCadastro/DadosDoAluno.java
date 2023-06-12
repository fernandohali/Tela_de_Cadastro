package InforCadastro;

public class DadosDoAluno {

    private String nomeDoAluno;
    private Integer idadeDoAluno;
    private String cpf;
    private String MatriculoDoAluno;
    private String sexoAluno;
    private String telefoneDoAluno;

    public DadosDoAluno(String nomeDoAluno, Integer idadeDoAluno, String cpf, String matriculoDoAluno, String sexoAluno,
            String telefoneDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
        this.idadeDoAluno = idadeDoAluno;
        this.cpf = cpf;
        MatriculoDoAluno = matriculoDoAluno;
        this.sexoAluno = sexoAluno;
        this.telefoneDoAluno = telefoneDoAluno;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public Integer getIdadeDoAluno() {
        return idadeDoAluno;
    }

    public void setIdadeDoAluno(Integer idadeDoAluno) {
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

}
