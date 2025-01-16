public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
    public double calculeazaPerimetru() {
        return 2 * (lungime + latime);
    }
    public double calculeazaArie() {
        return lungime * latime;
    }
    public double getLungime() {
        return lungime;
    }
    public double getLatime() {
        return latime;
    }
}
