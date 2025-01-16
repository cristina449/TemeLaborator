import java.time.LocalDate;

public class Produs {
    private String denumire;
    private double pret;
    private int cantitate;
    private LocalDate dataExpirarii;

    public Produs(String denumire, double pret, int cantitate, LocalDate dataExpirarii) {
        this.denumire = denumire;
        this.pret = pret;
        this.cantitate = cantitate;
        this.dataExpirarii = dataExpirarii;
    }

    public String getDenumire() {
        return denumire;
    }
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public double getPret() {
        return pret;
    }
    public void setPret(double pret) {
        this.pret = pret;
    }
    public int getCantitate() {
        return cantitate;
    }
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
    public LocalDate getDataExpirarii() {
        return dataExpirarii;
    }
    public void setDataExpirarii(LocalDate dataExpirarii) {
        this.dataExpirarii = dataExpirarii;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", cantitate=" + cantitate +
                ", dataExpirarii=" + dataExpirarii +
                '}';
    }

    public String formatProdus(String format) {
        return String.format("Produs: %s | Preț: %.2f | Cantitate: %d | Expiră: %s",
                denumire, pret, cantitate, dataExpirarii);
    }
}
