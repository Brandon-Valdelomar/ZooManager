/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;
import java.time.LocalDate;
/**
 *
 * @author Brandon Valdelomar
 */
public class Employees {
    protected int id;
    protected String nombre;
    protected String numero;
    protected String cedula;
    protected LocalDate FechaNacimiento;
    protected int Salario;

    public Employees(int id, String nombre, String numero, String cedula, LocalDate FechaNacimiento, int Salario) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
        this.cedula = cedula;
        this.FechaNacimiento = FechaNacimiento;
        this.Salario = Salario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getCedula() {
        return cedula;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public int getSalario() {
        return Salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setFechaNacimiento(LocalDate FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Employees{" + "id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", cedula=" + cedula + ", FechaNacimiento=" + FechaNacimiento + ", Salario=" + Salario + '}';
    }
      
            
            
    
}
