/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

/**
 *
 * @author djani
 */
public class Szemely {

    private static int sorSzamSzamlalo = 0;
    private int elteltNapokSzama = 0;

    private int sorSzam;
    private String nev;
    protected Naplo naplo;

    public Szemely(String nev) {
        this.nev = nev;
        sorSzamSzamlalo++;
        sorSzam = sorSzamSzamlalo;
        naplo = new Naplo();
        naplo.beir(sorSzam + ". " + nev + " naplója:");
    }

    public void ujabbNap() {
        elteltNapokSzama++;
        naplobejegyzes();
    }

    protected void naplobejegyzes() {
        naplo.beir("\n" + elteltNapokSzama + ". napi bejegyzés:");
    }

    @Override
    public String toString() {
        return sorSzam + ". " + nev;
    }

    public String getNaploTartalom() {
        return naplo.toString();
    }
}
