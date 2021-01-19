/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop2ejercicio3;

/**
 *
 * @author txaber
 */
import clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class POOp2ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Empleado> empleados;
    public static ArrayList<Cliente> clientes;
    
    public static void main(String[] args) {
        
        try {
            
            crearEmpleados();
            crearClientes();
            

            Empresa ruinasa = new Empresa("ruinasa",clientes,empleados);
            JOptionPane.showMessageDialog(null,ruinasa.mostrar());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"problemas "+e.getClass());
        }
    }
    
    public static void crearEmpleados() throws Exception {
        Empleado emp1 = new Empleado(993f,"Java",34);
        Empleado emp2 = new Empleado(801f,"Pedro",30);
        Empleado emp3 = new Empleado(500f,"Mikel",30);
        
        ArrayList<Empleado> list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        Directivo dir1 = new Directivo("gerente",list,999,"Mariano",61);
        
        list = new ArrayList();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Directivo dir2 = new Directivo("admin",list,999,"fernan",49);
        
        JOptionPane.showMessageDialog(null, emp1.mostrar());
        JOptionPane.showMessageDialog(null, emp2.mostrar());
        JOptionPane.showMessageDialog(null, dir1.mostrar());
        
        empleados = new ArrayList();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(dir1);
        empleados.add(dir2);
        
        Directivo[] directivos = new Directivo[] {dir1,dir2};
        DirectivoMas(directivos);
    }
    
    public static void crearClientes() throws Exception {
    
    Cliente cli1 = new Cliente("10101010","javier",27);
        Cliente cli2 = new Cliente("10111011","perico",23);
        Cliente cli3 = new Cliente("11101110","jon",42);
        Cliente cli4 = new Cliente("123123123","bart",36);
        Cliente cli5 = new Cliente("321321321","peter",47);
        
        JOptionPane.showMessageDialog(null, cli1.mostrar());
        JOptionPane.showMessageDialog(null, cli5.mostrar());
           
        clientes = new ArrayList();
        clientes.add(cli1);
        clientes.add(cli2);
        clientes.add(cli3);
        clientes.add(cli4);
        clientes.add(cli5);
    }
    
    public static void DirectivoMas(Directivo[] directivos) throws Exception {
        int max = 0;
        int pos = 0;
        for (int x = 0;x < directivos.length;x ++) {
            if (directivos[x].getSubordinados().size() > max) {
                max = directivos[x].getSubordinados().size();
                pos = x;
            }
        }
        // instanceof
        JOptionPane.showMessageDialog(null, "el director con mas subordinados es "+directivos[pos].getNombre());
    }
}
