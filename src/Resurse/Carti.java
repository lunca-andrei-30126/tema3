package Resurse;

public class Carti {
    private String numeautor;
    private String tip;

    public String getNumeautor() {
        return (String) this.numeautor;
    }

    public void setNumeautor(String numeautor) {
        this.numeautor = numeautor;
    }

    public String getTip() {
        return (String) this.tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Carti(String numeautor, String tip) {
        this.numeautor = numeautor;
        this.tip = tip;
    }
}
