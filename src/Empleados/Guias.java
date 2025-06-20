/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
/**
 *
 * @author Brandon Valdelomar
 */
public class Guias extends Cuidadores{
    private String[] Idiomas;

    public String[] getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String[] Idiomas) {
        this.Idiomas = Idiomas;
    }

    public Guias( String[] Idiomas, int id, String cedula, String name, String Numero) {
        super(id, cedula, name, Numero);
        this.Idiomas = Idiomas;
    }

    

   

    

    
}
