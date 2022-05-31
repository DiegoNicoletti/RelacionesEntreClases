/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.enumeraciones;

/**
 *
 * @author SHIRO
 */
public enum RazaPerruna {
    BEAGLE(1, "Beagle"), COCKER(2, "Cocker"), PITBULL(3, "Pitbull"), BORDER_COLLIE(4, "Border Collie");
    
    private Integer codigo;
    private String valor;
    
    private RazaPerruna(Integer codigo, String valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
}
