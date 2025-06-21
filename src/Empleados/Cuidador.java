/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.time.LocalDate;
import java.util.Vector;
/**
 *
 * @author Brandon Valdelomar
 */
public class Cuidador extends Empleado {
    private String Especialidad;
    private Vector<String> Actividades;

    
    public Cuidador(String Especialidad, Vector<String> Actividades, int id, String cedula, String name, String Numero, LocalDate FechaNacimiento) {
        super(id, cedula, name, Numero, FechaNacimiento);
        this.Especialidad = Especialidad;
        this.Actividades = Actividades;
    }

   
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public void AlimentarAnimal(String NombreAnimal){
        if(NombreAnimal == null || NombreAnimal.isBlank()){
            throw new IllegalArgumentException("El nombre de el animal no puede estar vacio");
    }
        String actividad = ("Se alimento a : " + NombreAnimal); 
            Actividades.add(actividad);
}

    public void VerificarEstado (String NombreAnimal) {
        if(NombreAnimal == null || NombreAnimal.isBlank()){
            throw new IllegalArgumentException("El nombre de el animal no puede estar vacio");
        }
        String actividad = ("Se verifico el estado de salud de: " + NombreAnimal);
        Actividades.add(actividad);
    }
    
    
    
    public Vector<String> getActividades() {
        return Actividades;
    }

    
    
    
    
}
