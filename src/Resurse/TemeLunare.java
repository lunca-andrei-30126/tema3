package Resurse;

public class TemeLunare {
    private String subiect;
    private String cerinte;
    private String disciplina;

    public TemeLunare(String subiect, String cerinte, String disciplina) {
        this.subiect = subiect;
        this.cerinte = cerinte;
        this.disciplina = disciplina;
    }

    public String getSubiect() {
        return subiect;
    }

    public void setSubiect(String subiect) {
        this.subiect = subiect;
    }

    public String getCerinte() {
        return cerinte;
    }

    public void setCerinte(String cerinte) {
        this.cerinte = cerinte;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
