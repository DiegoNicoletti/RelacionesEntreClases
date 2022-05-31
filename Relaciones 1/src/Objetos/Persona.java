/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import Enumeraciones.SexoHumano;
import java.util.List;

/**
 *
 * @author SHIRO
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private String documento;
    private SexoHumano sexo;
    
    //Asociamos la mascota al humano
    private List<Perro> perro;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public List<Perro> getPerro() {
        return perro;
    }

    public void setPerro(List<Perro> perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", sexo=" + sexo + ", perro=" + perro + '}';
    }

    
}
