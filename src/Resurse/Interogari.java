package Resurse;

import DatePersonale.Studenti;

import java.util.ArrayList;
import java.util.List;

public class Interogari {
    public static List<String> materialeStudent(Studenti studenti) {
        List<SugestiiLectura> sugestiiLecturaList = studenti.getSugestilectura();
        List<String> linkuri = new ArrayList<>();

        sugestiiLecturaList.forEach(lectura -> {
            linkuri.add(lectura.getLink());
        });

      /*  for(var lectura:sugestiiLecturaList)
        {
            linkuri.add(lectura.getLink());
        }*/

        return linkuri;
    }
}
