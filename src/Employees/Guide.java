/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import java.time.LocalDate;
import java.util.Vector;

/**
 *
 * @author Brandon Valdelomar
 */
public class Guide extends Employees {
    private Vector<String> Idiomas;
    private Object IdiomaNuevo;
    private Vector<String> RegistroRecorrido;

    public Guide(Vector<String> Idiomas, Object IdiomaNuevo, Vector<String> RegistroRecorrido, int Salario, int cedula, String numero, String nombre, String fechaNacimiento) {
        super(Salario, cedula, numero, nombre, fechaNacimiento);
        this.Idiomas = Idiomas;
        this.IdiomaNuevo = IdiomaNuevo;
        this.RegistroRecorrido = RegistroRecorrido;
    }

   

    public Vector<String> getIdiomas() {
        return Idiomas;
    }

    public Object getIdiomaNuevo() {
        return IdiomaNuevo;
    }

    public Vector<String> getRegistroRecorrido() {
        return RegistroRecorrido;
    }
    
    public void AgregarIdioma(String IdiomaNuevo){
        if(IdiomaNuevo == null || IdiomaNuevo.isBlank()){
            throw new IllegalArgumentException("El idioma no puede estar vacio");
        }
            if(!Idiomas.contains(IdiomaNuevo))
                Idiomas.add(IdiomaNuevo);
    }
       
     public void Recorridos(String NombreZona) {
        if(NombreZona == null || NombreZona.isBlank()){
            throw new IllegalArgumentException("El nombre de la zona no puede estar vacia");
            
        }
        String actividad = ("Se realizo el recorrido en la zona de: " + NombreZona);
        if (!RegistroRecorrido.contains(NombreZona))
            RegistroRecorrido.add(NombreZona);
            
            
    }
    
}
