/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitors;

import java.util.Vector;

/**
 *
 * @author Brandon Valdelomar
 */
public class Person {
    protected int cedula;
    protected String numero;
    protected String nombre;
    protected String fechaNacimiento;

    public int getCedula() {
        return cedula;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Person(int cedula, String numero, String nombre, String fechaNacimiento) {
        this.cedula = cedula;
        this.numero = numero;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Person{" + "cedula=" + cedula + ", numero=" + numero + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
   
    
    
}
