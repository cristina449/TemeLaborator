public class Excursie {
    private int idExcursie;
    private String destinatie;
    private int anul;
    private int idPersoana;

    public Excursie(int idPersoana, String destinatie, int anul) {
        this.idPersoana = idPersoana;
        this.destinatie = destinatie;
        this.anul = anul;
    }
    public int getIdExcursie() {
        return idExcursie;
    }
    public String getDestinatie() {
        return destinatie;
    }
    public int getAnul() {
        return anul;
    }
    public int getIdPersoana() {
        return idPersoana;
    }
    public void setIdExcursie(int idExcursie) {
        this.idExcursie = idExcursie;
    }
}
