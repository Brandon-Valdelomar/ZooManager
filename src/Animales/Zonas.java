/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animales;

/**
 *
 * @author Brandon Valdelomar
 */
public enum Zonas {
    GRANJA("Granja"),
    CONTACTO("Contacto"),
    ALIMENTACION("Alimentacion"),
    CONSERVACION("Conservacion"),
    TUNELNOCTURNO("TunelNocturno"),
    BIODIVERSIDAD("Biodiversidad");
  
    private final String ZonaUbicacion;

    private Zonas(String ZonaUbicacion) {
        this.ZonaUbicacion = ZonaUbicacion;
    }

    public String getZonaUbicacion() {
        return ZonaUbicacion;
    }

    @Override
    public String toString() {
        return "Zonas{" + "ordinal=" + ordinal() + ", name=" + name() + ", ZonaUbicacion=" + ZonaUbicacion + '}';
    }
    
    
    
}
