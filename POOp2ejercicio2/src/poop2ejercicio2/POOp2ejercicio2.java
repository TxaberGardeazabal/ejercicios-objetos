/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop2ejercicio2;

/**
 *
 * @author txaber
 */
import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class POOp2ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Estudio> estudios;
    public static ArrayList<Pelicula> peliculas;
    
    public static void main(String[] args) {
        
        try {
            crearEstudios();
            crearPeliculas();
            añadirPeliculas();
            
            peliculaMasLarga();
            estudioMasProductivo();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "problemas "+e.getClass());
        }
        
    }
    
    public static void crearEstudios() {
        
        estudios = new ArrayList();
        
        ArrayList<String> tel = new ArrayList();
        tel.add("111111112");
        estudios.add(new Estudio("warner bros","b","b","this@web.com","1999","b",tel));
        
        tel = new ArrayList();
        tel.add("111111113");
        estudios.add(new Estudio("disney","c","c","this@web.com","1989","c",tel));
        
        tel = new ArrayList();
        tel.add("111111114");
        estudios.add(new Estudio("universal","d","d","this@web.com","2000","d",tel));
    }
    
    public static void crearPeliculas() {
        
        peliculas = new ArrayList();
        
        ArrayList<Estudio> pro = new ArrayList();
        pro.add(estudios.get(0));
        peliculas.add(new Pelicula("El señor de los anillos",2001,130,"aventura",pro));
        
        pro = new ArrayList();
        pro.add(estudios.get(1));
        pro.add(estudios.get(2));
        peliculas.add(new Pelicula("Intocable",2003,70,"comedia",pro));
        
        pro = new ArrayList();
        pro.add(estudios.get(0));
        pro.add(estudios.get(2));
        peliculas.add(new Pelicula("tres y medio",2003,76,"comedia",pro));
        
        pro = new ArrayList();
        pro.add(estudios.get(1));
        peliculas.add(new Pelicula("avatar",1999,98,"ciencia ficcion",pro));
        
        pro = new ArrayList();
        pro.add(estudios.get(2));
        peliculas.add(new Pelicula("gru",2005,90,"infantil",pro));
    }
    
    public static void añadirPeliculas() {
        
        ArrayList<Pelicula> pel = new ArrayList();
        pel.add(peliculas.get(0));
        pel.add(peliculas.get(2));
        estudios.get(0).setPeliculas(pel);
        
        pel = new ArrayList();
        pel.add(peliculas.get(1));
        pel.add(peliculas.get(3));
        estudios.get(1).setPeliculas(pel);
        
        pel = new ArrayList();
        pel.add(peliculas.get(1));
        pel.add(peliculas.get(2));
        pel.add(peliculas.get(4));
        estudios.get(2).setPeliculas(pel);
    }
    
    public static void peliculaMasLarga() throws Exception {
        
        //Peliculas[] pelis = {peli1,peli2,peli3,peli4};
        float max = 0.0f;
        Pelicula masLarga = new Pelicula();
        
        for (int x = 0;x < peliculas.size(); x++) {
            if (peliculas.get(x).getDuracion() > max) {
                max = peliculas.get(x).getDuracion();
                masLarga = peliculas.get(x);
            }
        }
        String ret = "";
        for (int x = 0;x < masLarga.getProductor().size(); x++) {
            ret += masLarga.getProductor().get(x).getNombre() + ", ";
        }
        
        JOptionPane.showMessageDialog(null,ret+" ha(n) producido la pelicula mas larga");
    }
    
    public static void estudioMasProductivo() throws Exception {
        
        int max = 0;
        Estudio masProductivo = new Estudio();
        
        for (int x = 0;x < estudios.size();x ++) {
            if (estudios.get(x).getPeliculas().size() > max) {
                max = estudios.get(x).getPeliculas().size();
                masProductivo = estudios.get(x);
            }
        }
        
        JOptionPane.showMessageDialog(null, "el estudio con mas peliculas es: "+masProductivo.getNombre());
    }
}
