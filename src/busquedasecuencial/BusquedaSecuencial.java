/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernandito
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arreglo[]={3,7,5,4,9,2,8,1};
        
        int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a buscar"));
        
        int busqueda= busquedaSecuencial(arreglo,dato);
        
        if(busqueda!=-1){
            JOptionPane.showMessageDialog(null, "El dato fue encontrado en la posicion : "+busqueda);
            
            
        }else{
            JOptionPane.showMessageDialog(null,"El dato no se encontro");
            
        }
        
        
    }
    private static int busquedaSecuencial(int arreglos[],int datos){
        for (int i = 0; i < arreglos.length; i++) {
            if (datos==arreglos[i]){
                return i;
                
            }
            
        }
        
        return -1;
    }
}
