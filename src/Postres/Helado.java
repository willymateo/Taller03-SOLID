/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Leche.LecheEntera;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
    
    public Helado(String sabor){
        super(sabor);
        this.precioParcial = 7.85;
    }
    
    @Override
    public String toString() {
        return "Helado{" + "sabor= " + sabor + ", precioParcial= $" + precioParcial + ", aderezos= " + aderezos + '}';
    }

    @Override
    public void cambiarLeche(LecheEntera leche_Cambio) {
        leche_Cambio.usar();
    }
}
