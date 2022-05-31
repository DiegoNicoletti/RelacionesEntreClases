/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author SHIRO
 */
public class RevolverDeAgua {
    
    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    //  ¡¡¡METODOS!!!
    
    //Colocamos el agua en una posicion aleatoria
    //Y aleatoriamente seleccionamos una posicion para empezar.
    public void llenarRevolver(){
        
        posicionActual = (int)(Math.random()*6+1);
        posicionAgua = (int)(Math.random()*6+1);
        
    }
    
    //Mostramos si la posicion actual es la misma que donde esta el agua.
    public boolean mojar(){
        
        boolean respuesta = false;
        
        if(posicionActual==posicionAgua){
            respuesta = true;
        }
        
        return respuesta;
    }
    
    //Nos movemos a la siguiente posicion del tambor del revolver.
    public void siguienteChorro(){
        
        if(posicionActual==6){
            posicionActual=1;
        }else{
            posicionActual++;
        }
    }
    

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}
