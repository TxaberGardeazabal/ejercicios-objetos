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
public class Empresa {
    
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre, ArrayList<Cliente> clientes, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.clientes = clientes;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String mostrar() {
        String ret = "empresa "+this.getNombre()+"\n"
                + "clientes:\n";
        for (int x = 0;x < clientes.size();x ++) {
            ret += clientes.get(x).mostrar()+"\n";
        }
        ret += "Empleados:\n";
        for (int x = 0;x < empleados.size();x ++) {
            ret += empleados.get(x).mostrar()+"\n";
        }
        return ret;
    }

    
    
    
}
