/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Leche.LecheDescremada;
import Leche.LecheEntera;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{
    
    public Pastel(String sabor){
        super(sabor);
        this.precioParcial = 15.55;
    }
    @Override
    public String toString() {
        return "Pastel{" + "sabor= " + sabor + ", precioParcial= $" + precioParcial + ", aderezos= " + aderezos + '}';
    }

    @Override
    public void cambiarLeche(LecheEntera leche_Cambio) {
        if (leche_Cambio instanceof LecheDescremada) {
            System.out.println("Los pasteles no pueden usar leche deslactosada. ");
        }else{
            leche_Cambio.usar();
        }
    }
     
}
