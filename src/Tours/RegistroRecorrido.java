/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tours;
import java.time.LocalDate;
import java.util.Vector;



public class RegistroRecorrido {
    protected String guia;
    protected LocalDate fechaRecorrido;
    protected Vector<String> listaVisitantes;
    protected Vector<String> listaAnimales;
    protected String Animal;

    public RegistroRecorrido(String guia, LocalDate fechaRecorrido, Vector<String> listaVisitantes, Vector<String> listaAnimales) {
        if(listaVisitantes.isEmpty()){
            throw new IllegalArgumentException("La lista no puede estar vacia");
        }
            if (listaVisitantes.size() > 10){
                throw new IllegalArgumentException("La lista de visitantes no puede ser mayor que 10.");
            }
                    
        this.guia = guia;
        this.fechaRecorrido = fechaRecorrido;
        this.listaVisitantes = listaVisitantes;
        this.listaAnimales = listaAnimales;
    }

    public void AnimalesVisitados(){
        if(Animal != null){
            listaAnimales.add(Animal);
        }
    }

    public String getAnimal() {
        return Animal;
    }
   
    
    
    public String getGuia() {
        return guia;
    }

    public LocalDate getFechaRecorrido() {
        return fechaRecorrido;
    }

    public Vector<String> getListaVisitantes() {
        return listaVisitantes;
    }

    public Vector<String> getListaAnimales() {
        return listaAnimales;
    }

    public RegistroRecorrido() {
    }

    @Override
    public String toString() {
        return "RegistroRecorrido{" + "guia=" + guia + ", fechaRecorrido=" + fechaRecorrido + ", listaVisitantes=" + listaVisitantes + ", listaAnimales=" + listaAnimales + '}';
    }
    
    
    
}
