package DatePersonale;

import Resurse.Carti;
import Resurse.SugestiiLectura;
import Resurse.TemeLunare;

import java.util.ArrayList;
import java.util.List;

public class Studenti extends Persoane {
    private int anstudiu;
    private String tipbugetare;

    private List<Carti> carti;
    private List<TemeLunare> temelunare;
    private List<SugestiiLectura> sugestilectura;

    public List<Carti> getCarti() {
        return carti;
    }

    public void setCarti(List<Carti> carti) {
        this.carti = carti;
    }

    public List<TemeLunare> getTemelunare() {
        return temelunare;
    }

    public void setTemelunare(List<TemeLunare> temelunare) {
        this.temelunare = temelunare;
    }

    public List<SugestiiLectura> getSugestilectura() {
        return sugestilectura;
    }

    public void setSugestilectura(List<SugestiiLectura> sugestilectura) {
        this.sugestilectura = sugestilectura;
    }

    public Studenti(int anstudiu, String tipbugetare, List<Carti> carti, List<TemeLunare> temelunare, List<SugestiiLectura> sugestilectura) {
        this.anstudiu = anstudiu;
        this.tipbugetare = tipbugetare;
        this.carti = carti;
        this.temelunare = temelunare;
        this.sugestilectura = sugestilectura;
    }

    public Studenti(String name, int id, int anstudiu, String tipbugetare, List<Carti> carti, List<TemeLunare> temelunare, List<SugestiiLectura> sugestilectura) {
        super(name, id);
        this.anstudiu = anstudiu;
        this.tipbugetare = tipbugetare;
        this.carti = carti;
        this.temelunare = temelunare;
        this.sugestilectura = sugestilectura;
    }

    public int getAnstudiu() {
        return (int) this.anstudiu;
    }

    public void setAnstudiu(int anstudiu) {
        this.anstudiu = anstudiu;
    }

    public String getTipbugetare() {
        return (String) this.tipbugetare;
    }

    public void setTipbugetare(String tipbugetare) {
        this.tipbugetare = tipbugetare;
    }
}
