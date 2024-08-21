package rs.malkier.bankarskisistem.domain;

import java.util.Objects;

public class Racun {
    private TipRacuna tipRacuna;
    private Klijent klijent;
    private Banka banka;
    private float iznos;

    public Racun(TipRacuna tipRacuna, Klijent klijent, Banka banka, float iznos) {
        this.tipRacuna = tipRacuna;
        this.klijent = klijent;
        this.banka = banka;
        this.iznos = iznos;
    }

    public Racun() {
    }

    public TipRacuna getTipRacuna() {
        return tipRacuna;
    }

    public void setTipRacuna(TipRacuna tipRacuna) {
        this.tipRacuna = tipRacuna;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Banka getBanka() {
        return banka;
    }

    public void setBanka(Banka banka) {
        this.banka = banka;
    }

    public float getIznos() {
        return iznos;
    }

    public void setIznos(float iznos) {
        this.iznos = iznos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racun racun = (Racun) o;
        return Objects.equals(tipRacuna, racun.tipRacuna) && Objects.equals(klijent, racun.klijent) && Objects.equals(banka, racun.banka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipRacuna, klijent, banka);
    }

    @Override
    public String toString() {
        return "Racun{" +
                "tipRacuna=" + tipRacuna +
                ", klijent=" + klijent +
                ", banka=" + banka +
                ", iznos=" + iznos +
                '}';
    }
}
