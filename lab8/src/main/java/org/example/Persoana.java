public class Persoana {
    private int id;
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public int getId() {
        return id;
    }
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setId(int id) {
        this.id = id;
    }
}
