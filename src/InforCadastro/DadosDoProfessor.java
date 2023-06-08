package InforCadastro;

public class DadosDoProfessor {

    private int idProfessor;
    private String nomeDoProfessor;
    private int idadeDoProfessor;
    private String sexoDoProfessor;
    private String turmaDoprofessor;
    private int telefoneDoprofessor;

    public DadosDoProfessor(int idProfessor, String nomeDoProfessor, int idadeDoProfessor, String sexoDoProfessor,
            String turmaDoprofessor, int telefoneDoprofessor) {
        this.idProfessor = idProfessor;
        this.nomeDoProfessor = nomeDoProfessor;
        this.idadeDoProfessor = idadeDoProfessor;
        this.sexoDoProfessor = sexoDoProfessor;
        this.turmaDoprofessor = turmaDoprofessor;
        this.telefoneDoprofessor = telefoneDoprofessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
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

    public String getTurmaDoprofessor() {
        return turmaDoprofessor;
    }

    public void setTurmaDoprofessor(String turmaDoprofessor) {
        this.turmaDoprofessor = turmaDoprofessor;
    }

    public int getTelefoneDoprofessor() {
        return telefoneDoprofessor;
    }

    public void setTelefoneDoprofessor(int telefoneDoprofessor) {
        this.telefoneDoprofessor = telefoneDoprofessor;
    }

}
