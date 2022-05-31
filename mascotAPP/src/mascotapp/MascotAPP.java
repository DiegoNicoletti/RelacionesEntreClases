/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mascotapp.entidades.Mascota;
import mascotapp.entidades.Usuario;
import mascotapp.enumeraciones.SexoHumano;


/**
 *
 * @author SHIRO
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascota m1 = new Mascota("Fer", "Chiquito", "Perro");
        Mascota m2 = new Mascota("Pepa", "Filomena", "Perro");
        
        List<Mascota> mascotas = new ArrayList();
        mascotas.add(m1);
        mascotas.add(m2);
        
        Usuario u = new Usuario();
        
        u.setApellido("Fiorde");
        u.setSexo(SexoHumano.HOMBRE);
        u.setNacimiento(new Date("22/11/1994"));
        
        u.setMascotaFavorita(m1);
        
        u.setMascotas(mascotas);
        
        System.out.println(u.toString());
        
    }
    
}
