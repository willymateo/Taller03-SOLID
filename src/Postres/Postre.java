/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author test1
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void anadirAderezo(Aderezo aderezo){
        this.aderezos.add(aderezo);
    }
    
    public void quitarAderezo(Aderezo aderezo){
        this.aderezos.remove(aderezo);
    }

    public double getPrecioParcial() {
        return precioParcial;
    }
    
    
    
    
}
