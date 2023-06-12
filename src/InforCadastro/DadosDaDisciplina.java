package InforCadastro;

public class DadosDaDisciplina {

    private String disciplina;
    private String professorDaDisciplina;
    private String turmaDaDisciplina;
    private double horasDaDisciplina;

    public DadosDaDisciplina(String disciplina, String professorDaDisciplina, String turmaDaDisciplina,
            double horasDaDisciplina) {
        this.disciplina = disciplina;
        this.professorDaDisciplina = professorDaDisciplina;
        this.turmaDaDisciplina = turmaDaDisciplina;
        this.horasDaDisciplina = horasDaDisciplina;
    }

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

}
