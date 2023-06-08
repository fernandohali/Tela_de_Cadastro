package InforCadastro;

public class DadosDaDisciplina {

    private String disciplina;
    private int idDisciplina;
    private String professorDaDisciplina;
    private String alunoDaDisciplina;
    private String turmaDaDisciplina;
    private double horasDaDisciplina;
    private double notaDadisciplina;

    public DadosDaDisciplina(String disciplina, int idDisciplina, String professorDaDisciplina,
            String alunoDaDisciplina, String turmaDaDisciplina, double horasDaDisciplina, double notaDadisciplina) {
        this.disciplina = disciplina;
        this.idDisciplina = idDisciplina;
        this.professorDaDisciplina = professorDaDisciplina;
        this.alunoDaDisciplina = alunoDaDisciplina;
        this.turmaDaDisciplina = turmaDaDisciplina;
        this.horasDaDisciplina = horasDaDisciplina;
        this.notaDadisciplina = notaDadisciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getProfessorDaDisciplina() {
        return professorDaDisciplina;
    }

    public void setProfessorDaDisciplina(String professorDaDisciplina) {
        this.professorDaDisciplina = professorDaDisciplina;
    }

    public String getAlunoDaDisciplina() {
        return alunoDaDisciplina;
    }

    public void setAlunoDaDisciplina(String alunoDaDisciplina) {
        this.alunoDaDisciplina = alunoDaDisciplina;
    }

    public String getTurmaDaDisciplina() {
        return turmaDaDisciplina;
    }

    public void setTurmaDaDisciplina(String turmaDaDisciplina) {
        this.turmaDaDisciplina = turmaDaDisciplina;
    }

    public double getHorasDaDisciplina() {
        return horasDaDisciplina;
    }

    public void setHorasDaDisciplina(double horasDaDisciplina) {
        this.horasDaDisciplina = horasDaDisciplina;
    }

    public double getNotaDadisciplina() {
        return notaDadisciplina;
    }

    public void setNotaDadisciplina(double notaDadisciplina) {
        this.notaDadisciplina = notaDadisciplina;
    }

}
