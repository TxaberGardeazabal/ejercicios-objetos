
package poop2ejercicio1;

/**
 *
 * @author txaber
 */
/*
* no estudies este codigo
*
*/
import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class POOp2ejercicio1 {

    public static void main(String[] args) {
        try {
            // creacion de objetos
            Peliculas peli1 = new Peliculas("El señor de los anillos","2002",2.10f,"aventura");
            Peliculas peli2 = new Peliculas();
            Peliculas peli3 = new Peliculas("it","1990",1.50f,"terror");
            Peliculas peli4 = new Peliculas("up","2004",1.30f,"aventura");
            
            ArrayList<String> tel1 = new ArrayList();
            ArrayList<String> tel2 = new ArrayList();
            Estudios estudio1 = new Estudios("Disney","a","e","nombre@lugar.com","1999","i",tel1);
            Estudios estudio2 = new Estudios("Pixar","a","e","nombre@lugar.com","2000","i",tel2);
            
            // ...
            peli1.setProductor(estudio1);
            peli1.setProductor(estudio2);
            peli2.setProductor(estudio1);
            peli3.setProductor(estudio1);
            peli4.setProductor(estudio2);
            
            // mostrar datos
            JOptionPane.showMessageDialog(null,peli1.toString());
            JOptionPane.showMessageDialog(null,peli2.toString());
            // mas comprensible
            JOptionPane.showMessageDialog(null, peli1.getTitulo() + " por " + peli1.getProductor());
            
            Peliculas[] pelis = {peli1,peli2,peli3,peli4};
            Estudios[] estudios = {estudio1,estudio2};
            
            peliculaMasLarga(pelis);
            estudioMasProductivo(pelis,estudios);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "problemas"+e.getClass());
        }
    }   
    
    public static void peliculaMasLarga(Peliculas[] pelis) throws Exception {
        
        //Peliculas[] pelis = {peli1,peli2,peli3,peli4};
        float max = 0.0f;
        Peliculas masLarga = new Peliculas();
        
        for (int x = 0;x < 4; x++) {
            if (pelis[x].getDuracion() > max) {
                max = pelis[x].getDuracion();
                masLarga = pelis[x];
            }
        }
        String ret = "";
        for (int x = 0;x < masLarga.getProductor().size(); x++) {
            ret += masLarga.getProductor().get(x).getNombre() + ", ";
        }
        
        JOptionPane.showMessageDialog(null,ret+" ha(n) producido la pelicula mas larga");
    }
    
    public static void estudioMasProductivo(Peliculas[] pelis, Estudios[] estudios) throws Exception {
        
        int[] pelisEstudio = new int[2];
        int max = 0;
        int pos = 0;
        
        for (int z = 0;z < estudios.length;z++) {
            for (int x = 0;x < pelis.length; x++) {
                for (int y = 0;y < pelis[x].getProductor().size(); y++) {
                    // solucion anticuada al problema de objetos
                    Estudios dummy = (Estudios) pelis[x].getProductor().get(y);
                    String nombreEstudio = dummy.getNombre();
                
                    //"comparar"
                    if (nombreEstudio.equals(estudios[z].getNombre()))
                    {
                        pelisEstudio[z] ++;
                    }
                    
                }
            }
        }
        
        for (int x = 0;x < pelisEstudio.length; x++) {
            if (pelisEstudio[x] > max) {
                max = pelisEstudio[x];
                pos = x;
            }
        }
        JOptionPane.showMessageDialog(null, "el estudio con mas peliculas es: "+estudios[pos].getNombre());
    }
}
