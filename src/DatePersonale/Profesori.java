package DatePersonale;

import java.util.ArrayList;
import java.util.List;

public class Profesori extends Persoane {

    String cursuri;

    public String getCursuri() {
        return (String) this.cursuri;
    }

    public void setCursuri(String cursuri) {
        this.cursuri = cursuri;
    }

    public Profesori(String cursuri) {
        this.cursuri = cursuri;
    }
}
