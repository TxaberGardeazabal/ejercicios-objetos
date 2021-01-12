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
public class Estudios {
    
    private String nombre;
    private String ciudad;
    private String direccion;
    private String dirWeb;
    private String fechaFundacion;
    private String pais;
    private ArrayList<String> telefonos;

    public Estudios(String nombre, String ciudad, String direccion, String dirWeb, String fechaFundacion, String pais, ArrayList telefonos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirWeb = dirWeb;
        this.fechaFundacion = fechaFundacion;
        this.pais = pais;
        this.telefonos = telefonos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirWeb() {
        return dirWeb;
    }

    public void setDirWeb(String dirWeb) {
        this.dirWeb = dirWeb;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "Estudios{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", direccion=" + direccion + ", dirWeb=" + dirWeb + ", fechaFundacion=" + fechaFundacion + ", pais=" + pais + ", telefonos=" + telefonos + '}';
    }
    
    
}
