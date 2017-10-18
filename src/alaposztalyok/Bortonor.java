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
public class Bortonor extends Szemely {

    private static int hatar;

    private int agresszio;

    public Bortonor(String nev) {
        super(nev);
    }

    public void agresszioNovekedes(int ertek) {
        agresszio+=ertek;
    }

    
    
    private boolean gonoszkodik() {
        if(agresszio >= hatar){
            return true;
        }
        return false;
    }

    @Override
    protected void naplobejegyzes() {
        super.naplobejegyzes();
        naplo.beir("\n az agresszió mértéke: " + agresszio);
        if(gonoszkodik()){
            naplo.beir("; már gonoszkodik");
        }
    }

    
    public int getAgresszio() {
        return agresszio;
    }
    
    public static void setHatar(int hatar) {
        Bortonor.hatar = hatar;
    }

    
    
}
