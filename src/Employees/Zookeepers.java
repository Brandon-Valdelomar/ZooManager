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
public class Zookeepers extends Employees {
    private String Especialidad;
    private Vector<String> Actividades;
    
    

    public Zookeepers(int id, String nombre, String numero, String cedula, LocalDate FechaNacimiento, int Salario) {
        super(id, nombre, numero, cedula, FechaNacimiento, Salario);
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

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public Vector<String> getActividades() {
        return Actividades;
    }

    @Override
    public String toString() {
        return "Zookeepers{" + "Especialidad=" + Especialidad + ", Actividades=" + Actividades + '}';
    }
    
    
    
}
