/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Objetos.Carta;
import Objetos.Mazo;
import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author SHIRO
 */
public class ServicioMazo {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Mazo cartasEntregadas = new Mazo();
    private Mazo mazoInicial = new Mazo();
    private Collections c;

    public Mazo crearMazo() {

        System.out.println("Se abre el mazo");

        ArrayList<Carta> cs = new ArrayList();
        ArrayList<Carta> out = new ArrayList();
        cartasEntregadas.setCartas(out);

        for (Palo aux : Palo.values()) {
            String p = aux.getNombre();

            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {
                    //Cartas desechadas
                } else {
                    Carta c = new Carta(i + 1, aux);
                    cs.add(c);
                }
            }
        }

        mazoInicial.setCartas(cs);
        System.out.println("Baraja Iniciada.");

        return mazoInicial;
    }

    public void barajar() {
        c.shuffle(mazoInicial.getCartas());
    }

    public Carta siguienteCarta() {
        Carta c = mazoInicial.getCartas().get(0);
        System.out.println("La siguiente carta es: " + mazoInicial.getCartas().get(0).toString());
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + mazoInicial.getCartas().size());
    }

    public void darCartas() {
        System.out.println("Diga la cantidad de cartas que va a pedir.");
        int pedir = leer.nextInt();

        if (pedir <= mazoInicial.getCartas().size()) {
            for (int i = 0; i < pedir; i++) {
                System.out.println("Se entrega el: " + mazoInicial.getCartas().get(i).toString() + " al jugador.");
            }
            for (int i = 0; i < pedir; i++) {
                cartasEntregadas.getCartas().add(mazoInicial.getCartas().get(0));
                mazoInicial.getCartas().remove(0);
            }
        } else {
            System.out.println("Cartas insuficientes, no se entrego ninguna carta al jugador.");
            cartasDisponibles();
        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartas().size() == 0) {
            System.out.println("No hay cartas usadas.");
        } else {
            System.out.println("Las cartas usadas son:");
            String oracion = "";
            int contador = 0;

            for (Object aux : cartasEntregadas.getCartas()) {
                oracion = oracion.concat(aux.toString());
                oracion = oracion.concat(". ");
                contador++;

                if (contador == 10) {
                    System.out.println(oracion);
                    oracion = "";
                    contador = 0;
                }

            }
        }
    }

    public void mostrarBaraja() {
        if (mazoInicial.getCartas().size() == 0) {
            System.out.println("No quedan cartas en el mazo.");
        } else {
            System.out.println("Las cartas del mazo son:");
            String oracion = "";
            int contador = 0;

            for (Object aux : mazoInicial.getCartas()) {
                oracion = oracion.concat(aux.toString());
                oracion = oracion.concat(". ");
                contador++;

                if (contador == 10) {
                    System.out.println(oracion);
                    oracion = "";
                    contador = 0;
                }

            }
        }
    }
    
    public void menuDeOpciones(){
        
        System.out.println("");
        System.out.println("        MENU        ");
        System.out.println("Seleccione una opcion.");
        System.out.println("1_Barajar.");
        System.out.println("2_ver Siguiente Carta.");
        System.out.println("3_Pedir cartas.");
        System.out.println("4_Ver cartas en el mazo.");
        System.out.println("5_Ver cartas entregadas.");
        System.out.println("6_Salir");
        String opcion = leer.next();
        
        switch(opcion){
            case "1":
                barajar();
                System.out.println("Mazo mezclado");
                menuDeOpciones();
                break;
            case "2":
                siguienteCarta();
                menuDeOpciones();
                break;
            case "3":
                darCartas();
                menuDeOpciones();
                break;
            case "4":
                mostrarBaraja();
                menuDeOpciones();
                break;
            case "5":
                cartasMonton();
                menuDeOpciones();
                break;
            case "6":
                System.out.println("FIN");
                break;
            default:
                System.out.println("Opcion no valida.");
                menuDeOpciones();
        }
    }
}
