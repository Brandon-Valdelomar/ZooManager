/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animales;
import java.time.LocalDateTime;
/**
 *
 * @author Brandon Valdelomar
 */
public class Animal {
    private String id;
    private String nombre;
    private String especie;
    private LocalDateTime FechaNacimiento;
    private String ZonaUbicacion;

    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public LocalDateTime getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getZonaUbicacion() {
        return ZonaUbicacion;
    }

    public void setFechaNacimiento(LocalDateTime FechaNacimiento) {
        this.FechaNacimiento = LocalDateTime.now();
    }

        public Animal(String id, String nombre, String especie, String ZonaUbicacion) {
            this.id = id;
            this.nombre = nombre;
            this.especie = especie;
            this.FechaNacimiento = LocalDateTime.now();
            this.ZonaUbicacion = ZonaUbicacion;
        }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", FechaNacimiento=" + FechaNacimiento + ", ZonaUbicacion=" + ZonaUbicacion + '}';
    }
        
    }
    
    
    

