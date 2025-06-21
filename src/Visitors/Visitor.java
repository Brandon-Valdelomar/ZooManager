/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visitors;
import java.time.LocalDate;
/**
 *
 * @author Brandon Valdelomar
 */
public class Visitor extends Person {
    protected int tipoEntrada;
    protected String RecorridoElegido;
    protected LocalDate fechaVisita;

    public Visitor(int tipoEntrada, String RecorridoElegido, LocalDate fechaVisita, int cedula, String numero, String nombre, String fechaNacimiento) {
        super(cedula, numero, nombre, fechaNacimiento);
        this.tipoEntrada = tipoEntrada;
        this.RecorridoElegido = RecorridoElegido;
        this.fechaVisita = fechaVisita;
    }

    public int getTipoEntrada() {
        return tipoEntrada;
    }

    public String getRecorridoElegido() {
        return RecorridoElegido;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setTipoEntrada(int tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public void setRecorridoElegido(String RecorridoElegido) {
        this.RecorridoElegido = RecorridoElegido;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    @Override
    public String toString() {
        return "Visitor{" + "tipoEntrada=" + tipoEntrada + ", RecorridoElegido=" + RecorridoElegido + ", fechaVisita=" + fechaVisita + '}';
    }
    
    
    
  

    
    
    
    
    
}
