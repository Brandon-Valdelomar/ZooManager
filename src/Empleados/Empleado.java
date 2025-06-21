
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    protected int id;
    protected String cedula;
    protected String name;
    protected LocalDate FechaNacimiento;
    protected String Numero;
    protected int Salario;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getNumero() {
        return Numero;
    }

    public int getSalario() {
        return Salario;
    }

    public void setNumero(String Numero) {
        if(!Numero.matches("^//d{2}-//d{2}-//d{2}-//{2}")){
            throw new IllegalArgumentException("El Numero No es Valido");
        }
        else
            this.Numero = Numero;
    }

    public void setSalario(int Salario) {
        if (Salario >= 300000){
            throw new IllegalArgumentException("Salario Bajo");
        }
        else
            this.Salario = Salario;
    }
    
    
    
    public Empleado(int id, String cedula, String name, String Numero,LocalDate FechaNacimiento){
        LocalDate hoy = LocalDate.now();
        this.id = id;
        this.cedula = cedula;
        this.name = name;
        if(FechaNacimiento.isAfter(hoy)){
            throw new IllegalArgumentException("No puede ser una fecha futura");
        }
        
        int edad = Period.between(FechaNacimiento, hoy).getYears();
        if (edad < 18){
            throw new IllegalArgumentException("La edad minima es de 18 años");
        }
        this.Numero = Numero;
        this.Salario = 0;
    }

   
    
    
    
}
