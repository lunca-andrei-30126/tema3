import DatePersonale.Studenti;
import Resurse.Carti;
import Resurse.Interogari;
import Resurse.SugestiiLectura;
import Resurse.TemeLunare;

import java.util.ArrayList;
import java.util.List;

import static Resurse.Interogari.materialeStudent;

public class Main {

    public static void main(String[] args) {
        List<Carti> listadecarti = new ArrayList<>();
        Carti carti = new Carti("Gavrea", "electronica");
        listadecarti.add(carti);

        List<TemeLunare> temelunare = new ArrayList<>();
        TemeLunare temelunare1 = new TemeLunare("tema1","10 exerciti","matematica");
        temelunare.add(temelunare1);

        List<SugestiiLectura> sugestiiLecturaList = new ArrayList<>();
        SugestiiLectura sugestiiLectura = new SugestiiLectura("https://recruit-me.it/moodle/mod/assign/view.php?id=9037");
        sugestiiLecturaList.add(sugestiiLectura);

        Studenti student = new Studenti("Popescu",1,3, "buget"
                ,listadecarti
                ,temelunare
                ,sugestiiLecturaList
        );
        System.out.println(materialeStudent(student));
    }
}