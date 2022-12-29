package DatePersonale;

public class Persoane {
    private String name;
    private int id;

    public Persoane() {

    }

    public String getName() {
        return (String) this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return (int) this.id;
    }

    public Persoane(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
