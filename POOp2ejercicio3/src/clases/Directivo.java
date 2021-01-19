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

public class Directivo extends Empleado {
    
    private String categoria;
    private ArrayList<Empleado> subordinados;

    public Directivo(String categoria, ArrayList<Empleado> subordinados, float sueldo_bruto, String nombre, int edad) {
        super(sueldo_bruto, nombre, edad);
        this.categoria = categoria;
        this.subordinados = subordinados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
    
    @Override
    public String mostrar() {
        String sub = "";
        for (Empleado subordinado : subordinados) {
            sub += " " + subordinado.getNombre();
        }
        return "nombre "+this.getNombre()+" edad "+this.getEdad()+" sueldo "+this.getSueldo_bruto()+" categoria "+this.getCategoria()
                +"\nsubordinados:"+sub;
    }
}
