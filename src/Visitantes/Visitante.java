/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitantes;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Brandon Valdelomar
 */
public class Visitante {
    protected int cedula;
    protected String numero;
    protected String nombre;
    protected String fechaNacimiento;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    
    
    public void setNumero(String numero) {
        if(!numero.matches("^//d{2}-//d{2}-//d{2}-//d{2}")){
            throw new IllegalArgumentException("El formato de numero no es correcto");
        }
        else
            this.numero = numero;
    }

    @Override
    public String toString() {
        return "Visitante{" + "cedula=" + cedula + ", numero=" + numero + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
  
    
    
}
