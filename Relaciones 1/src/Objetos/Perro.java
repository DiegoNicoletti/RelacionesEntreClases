/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Enumeraciones.RazaPerro;
import Enumeraciones.TamanioPerro;

/**
 *
 * @author SHIRO
 */
public class Perro {
    
    private String nombre;
    private RazaPerro raza;
    private Integer edad;
    private TamanioPerro tamanio;
    private Persona duenio;

    public Perro() {
    }

    public Perro(String nombre, RazaPerro raza, Integer edad, TamanioPerro tamanio, Persona duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazaPerro getRaza() {
        return raza;
    }

    public void setRaza(RazaPerro raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public TamanioPerro getTamanio() {
        return tamanio;
    }

    public void setTamanio(TamanioPerro tamanio) {
        this.tamanio = tamanio;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", duenio=" + duenio + '}';
    }

    
    
}
