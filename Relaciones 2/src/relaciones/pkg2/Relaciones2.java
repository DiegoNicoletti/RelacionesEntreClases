/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.pkg2;

import Objetos.Juego;
import Objetos.Jugador;
import Objetos.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class Relaciones2 {

    /**
     * @param args the command line arguments
     */
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Inicializamos el servicio.
        
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.println("Iniciaremos el juego de la ruleta.");
        System.out.println("Seleccione la cantidad de jugadores deseados, minimo 1 maximo 6.");
        
        int cantidadJugadores = leer.nextInt();
        
        if(cantidadJugadores<1 || cantidadJugadores>6){
            cantidadJugadores = 6;
        }
       
        for (int i = 0; i < cantidadJugadores; i++) {
            
            Jugador pj = new Jugador(i + 1);
            jugadores.add(pj);
        }
        
        System.out.println("Se prepara el revolver para el juego.");
        RevolverDeAgua rda = new RevolverDeAgua();
        rda.llenarRevolver();
        
        System.out.println("El revolver fue cargado, listo para el juego.");
        Juego j = new Juego();
        j.llenarJuego(jugadores, rda);
        
        boolean juegoSigue = true;
        int turno = 0;
        
        while(juegoSigue){
            if(turno==cantidadJugadores){
                turno=0;
            }
            
            System.out.println("El "+j.getJugadores().get(turno).getNombre()+" procede a disparar.");
            juegoSigue = j.ronda(turno);
            
            if(juegoSigue){
                System.out.println("El "+j.getJugadores().get(turno).getNombre()+" se salva.");
            }else{
                System.out.println("El "+j.getJugadores().get(turno).getNombre()+" ha sido mojado.");
                System.out.println("Juego Finalizado.");
            }
            turno++;
        }
        System.out.println("");
    }
    
}
