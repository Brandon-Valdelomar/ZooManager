/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;
import java.time.LocalDate;
import java.util.Vector;

public class RegistroVisitas {
  protected String nombreVisitante;
   protected LocalDate fechaVisita;
   protected Vector<String> Visitas;
   
   public static void RegistroVisitas(LocalDate fechaVisita,Vector<String> Visitas,String nombreVisitante){
       if(nombreVisitante == null || nombreVisitante.isBlank()){
           throw new IllegalArgumentException("El nombre de el visitante no puede estar vacio.");
       }
        LocalDate hoy = LocalDate.now();
            if(fechaVisita.isAfter(hoy)){
                throw new IllegalArgumentException("La fecha no puede ser despues de hoy.");
            } 
                    
        String Visita = ("Realizo una Visita :" + nombreVisitante + "En la fecha: " + fechaVisita);
                Visitas.add(Visita);
            }

    public String getNombreVisitante() {
        return nombreVisitante;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    @Override
    public String toString() {
        return "RegistroVisitas{" + "nombreVisitante=" + nombreVisitante + ", fechaVisita=" + fechaVisita + ", Visitas=" + Visitas + '}';
    }

   
    
    }
