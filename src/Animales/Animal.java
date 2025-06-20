/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import java.time.LocalDate;
/**
 *
 * @author Brandon Valdelomar
 */
public class Animal {
    private String id;
    private String nombre;
    private String especie;
    private LocalDate FechaNacimiento;
    private Zonas ZonaUbicacion;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }


    public void setZonaUbicacion(Zonas ZonaUbicacion) {
        this.ZonaUbicacion = ZonaUbicacion;
    }

    public Animal(String id, String nombre, String especie, LocalDate FechaNacimiento, Zonas ZonaUbicacion) {
        if (id.matches("^[\\w]-[0-9]{4}$"))
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        if (!FechaNacimiento.isAfter(LocalDate.now())){
            this.FechaNacimiento = FechaNacimiento;
        this.ZonaUbicacion = Zonas.CONSERVACION;
    }

    
    }

   

    
    
        

   
        
}