/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.pkg1;

import Enumeraciones.RazaPerro;
import Enumeraciones.TamanioPerro;
import Objetos.Perro;
import Objetos.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SHIRO
 */
public class Relaciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Perro p1 = new Perro("Mancha", RazaPerro.CALLEJERO, 11, TamanioPerro.PEQUEÑO, null);
        Perro p2 = new Perro("Violeta", RazaPerro.OVEJERO, 8, TamanioPerro.GRANDE, null);
        
        List<Perro> perro = new ArrayList();
        perro.add(p1);
        perro.add(p2);
        
        Persona h1 = new Persona();
        Persona h2 = new Persona();
        
        h1.setNombre("Diego");
        h1.setApellido("asdasdasd");
        h1.setDocumento("64115159");
        h1.setEdad(28);
        h1.setPerro((List<Perro>) p1);
        p1.setDuenio(h1);
        
        h2.setNombre("Loana");
        h2.setApellido("asdasdasd");
        h2.setDocumento("59813866");
        h2.setEdad(25);
        h2.setPerro((List<Perro>) p2);
        p2.setDuenio(h2);
        
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        
        
        
    }
    
}
