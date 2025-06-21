/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Visitors.Person;





public class Employees extends Person{
    protected int Salario;

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public Employees(int Salario, int cedula, String numero, String nombre, String fechaNacimiento) {
        super(cedula, numero, nombre, fechaNacimiento);
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Employees{" + "Salario=" + Salario + '}';
    }

}
