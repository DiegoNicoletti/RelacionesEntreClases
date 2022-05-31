/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.entidades;

import java.util.Date;
import java.util.List;
import mascotapp.enumeraciones.SexoHumano;

/**
 *
 * @author SHIRO
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
    private List<Mascota> mascotas;
    private Mascota MascotaFavorita;

    public Usuario() {
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

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Mascota getMascotaFavorita() {
        return MascotaFavorita;
    }

    public void setMascotaFavorita(Mascota MascotaFavorita) {
        this.MascotaFavorita = MascotaFavorita;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ",\n mascotas=" + mascotas + ", MascotaFavorita=" + MascotaFavorita + '}';
    }

}
