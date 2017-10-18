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
public class Fogoly extends Szemely {

    private int fasultsag;

    public Fogoly(String nev) {
        super(nev);
    }

    public void fasul() {
        fasultsag++;
    }

    public void lazad() {
        fasultsag--;
    }

    @Override
    protected void naplobejegyzes() {
        super.naplobejegyzes();
        naplo.beir("\n a fásultság mértéke: " + fasultsag);
    }

    
    public int getFasultsag() {
        return fasultsag;
    }
    
}
