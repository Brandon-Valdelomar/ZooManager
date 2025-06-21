/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.util.Vector;
import java.time.LocalDate;
/**
 *
 * @author Brandon Valdelomar
 */
public class Guias extends Empleado{
    private Vector<String> Idiomas;
    private Object IdiomaNuevo;
    private Vector<String> RegistroRecorrido;

    
    public String[] getIdiomas() {
        return Idiomas.toArray(new String[0]);
    }

    public void setIdiomas(Vector<String> Idiomas) {
        this.Idiomas = Idiomas;
    }


    
   
    

    public Guias(Vector<String> Idiomas, int id, String cedula, String name, String Numero, LocalDate FechaNacimiento) {
        super(id, cedula, name, Numero, FechaNacimiento);
        this.Idiomas = Idiomas;
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