/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author txaber
 */
public class Peliculas {
    
    private String titulo;
    private String año;
    private Float duracion;
    private String tipo;
    private ArrayList<Estudios> productor;

    public Peliculas() {
        this.titulo = "desconocido";
        this.año = "0000";
        this.duracion = 0.0f;
        this.productor = new ArrayList();
    }
            
    public Peliculas(String titulo, String año, Float duracion, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.productor = new ArrayList();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Estudios> getProductor() {
        //String ret = "";
        //for (Estudios productor1 : productor) {
        //    ret += productor1.getNombre() + " ";
        //}
        //return ret;
        return this.productor;
    }

    public void setProductor(Estudios productor) {
        this.productor.add(productor);
    }
    
    public void modificarPelicula() {}
    
    public void despliegaPelicula() {}
    
    public void eliminarPelicula() {}

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", a\u00f1o=" + año + ", duracion=" + duracion + ", tipo=" + tipo + ", productor=" + productor + '}';
    }
    
}
