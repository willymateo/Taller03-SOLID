/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    public String nombre;
    //MALVAVISCOS,FRUTILLA,CREMA

    public abstract void setNombre();
    
    public String toString() {
        return nombre.toUpperCase();
    }
}
