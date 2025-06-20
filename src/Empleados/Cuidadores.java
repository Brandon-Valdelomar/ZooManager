/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;
import java.time.LocalDate;
/**
 *
 * @author Brandon Valdelomar
 */
public abstract class Cuidadores {
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
        this.Numero = Numero;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public Cuidadores(int id, String cedula, String name, String Numero) {
        this.id = id;
        this.cedula = cedula;
        this.name = name;
        if(!FechaNacimiento.isAfter(LocalDate.now())){
            this.FechaNacimiento = FechaNacimiento;
        }
        this.Numero = Numero;
        this.Salario = 0;
    }

   
    
    
    
}
