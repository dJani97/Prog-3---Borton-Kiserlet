/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djani
 */
public class Naplo {
    
    private List<String> bejegyzesek = new ArrayList<>();

    void beir(String bejegyzes) {
        bejegyzesek.add(bejegyzes);
    }

    @Override
    public String toString() {
        String string = "";
        
        for (String bejegyzes : bejegyzesek) {
            string += bejegyzes;
        }
        
        return string;
    }
}
