package InforCadastro;

public class DadosDoProfessor {

    private String nomeDoProfessor;
    private int idadeDoProfessor;
    private String sexoDoProfessor;
    private String DisciplinaDoprofessor;
    private String telefoneDoProfessor;

    public DadosDoProfessor(String nomeDoProfessor, int idadeDoProfessor, String sexoDoProfessor,
            String disciplinaDoprofessor, String telefoneDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.idadeDoProfessor = idadeDoProfessor;
        this.sexoDoProfessor = sexoDoProfessor;
        DisciplinaDoprofessor = disciplinaDoprofessor;
        this.telefoneDoProfessor = telefoneDoProfessor;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public int getIdadeDoProfessor() {
        return idadeDoProfessor;
    }

    public void setIdadeDoProfessor(int idadeDoProfessor) {
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

}
