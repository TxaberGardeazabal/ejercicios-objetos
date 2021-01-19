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
public class Cliente extends Persona {
    
    private String telefono_de_contacto;

    public Cliente(String telefono_de_contacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefono_de_contacto = telefono_de_contacto;
    }

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    
    @Override
    public String mostrar() {
        return "nombre "+this.getNombre()+" edad "+this.getEdad()+" telefono de contacto "+this.getTelefono_de_contacto();
        // return super.mostrar() + " " + this.telefono_de_contacto();
    }
}
