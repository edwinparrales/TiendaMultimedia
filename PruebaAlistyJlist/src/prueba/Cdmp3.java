/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author UsuarioEp
 */
public class Cdmp3 {
    private String codigo, nomCanci,nombInterpr,genero;
    private double valor;

    public Cdmp3() {
    }

    public Cdmp3(String codigo, String nomCanci, String nombInterpr, String genero, double valor) {
        this.codigo = codigo;
        this.nomCanci = nomCanci;
        this.nombInterpr = nombInterpr;
        this.genero = genero;
        this.valor = valor;
    }

  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomCanci() {
        return nomCanci;
    }

    public void setNomCanci(String nomCanci) {
        this.nomCanci = nomCanci;
    }

    public String getNombInterpr() {
        return nombInterpr;
    }

    public void setNombInterpr(String nombInterpr) {
        this.nombInterpr = nombInterpr;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
