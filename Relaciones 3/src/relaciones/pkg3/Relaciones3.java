/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.pkg3;

import Servicios.ServicioMazo;


/**
 *
 * @author SHIRO
 */
public class Relaciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioMazo sm = new ServicioMazo();
        sm.crearMazo();
        sm.menuDeOpciones();
        
    }
    
}
