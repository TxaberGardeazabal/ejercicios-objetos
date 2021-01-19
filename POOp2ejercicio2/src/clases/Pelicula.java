/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author txaber
 */
import java.util.ArrayList;

public class Pelicula {
    
    private String titulo;
    private int año;
    private float duracion;
    private String tipo;
    private ArrayList<Estudio> productor;

    public Pelicula(String titulo, int año, float duracion, String tipo, ArrayList<Estudio> productor) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        this.productor = productor;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getProductor() {
        return productor;
    }

    public void setProductor(ArrayList<Estudio> productor) {
        this.productor = productor;
    }
    
    
}
