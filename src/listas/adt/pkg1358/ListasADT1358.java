/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.adt.pkg1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author jose_
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("José"));
        lsl.append(new String("Mariana"));
        lsl.append(new String("Diego"));
        lsl.append("Daniela");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        lsl2.append(new Empleado(1, "José", "Pérez", "García", 1850.5f, 2015 ,4));
        lsl2.append(new Empleado(1, "Diego", "Pérez", "Hernández", 1950.5f, 2014 ,5));
        lsl2.append(new Empleado(1, "Diana", "Bonilla", "García", 1870.5f, 2015 ,2));
        lsl2.append(new Empleado(1, "Daniela", "Casillas", "López", 1820.5f, 2015 ,1));
        
        lsl2.transversal();
      
      
    }
    
}
