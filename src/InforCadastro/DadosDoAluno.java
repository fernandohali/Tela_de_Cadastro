package InforCadastro;

public class DadosDoAluno {

    private String nomeDoAluno;
    private int idAluno;
    private int idadeDoAluno;
    private String cpfDoAluno;
    private String sexo;
    private String turma;
    private String nomeDoPai;
    private String nomeDaMae;
    private int telefoneDoPai;
    private int telefoneDaMae;

    public DadosDoAluno(String nomeDoAluno, int idAluno, int idadeDoAluno, String cpfDoAluno, String sexo, String turma,
            String nomeDoPai, String nomeDaMae, int telefoneDoPai, int telefoneDaMae) {
        this.nomeDoAluno = nomeDoAluno;
        this.idAluno = idAluno;
        this.idadeDoAluno = idadeDoAluno;
        this.cpfDoAluno = cpfDoAluno;
        this.sexo = sexo;
        this.turma = turma;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.telefoneDoPai = telefoneDoPai;
        this.telefoneDaMae = telefoneDaMae;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdadeDoAluno() {
        return idadeDoAluno;
    }

    public void setIdadeDoAluno(int idadeDoAluno) {
        this.idadeDoAluno = idadeDoAluno;
    }

    public String getCpfDoAluno() {
        return cpfDoAluno;
    }

    public void setCpfDoAluno(String cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public int getTelefoneDoPai() {
        return telefoneDoPai;
    }

    public void setTelefoneDoPai(int telefoneDoPai) {
        this.telefoneDoPai = telefoneDoPai;
    }

    public int getTelefoneDaMae() {
        return telefoneDaMae;
    }

    public void setTelefoneDaMae(int telefoneDaMae) {
        this.telefoneDaMae = telefoneDaMae;
    }

}
