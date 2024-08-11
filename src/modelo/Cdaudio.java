/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author UsuarioEp
 */
public class Cdaudio extends Producto {
    private String nomInter,nomCancion;

    public Cdaudio() {
    }

    public Cdaudio(String nomInter, String nomCancion, String cod, String nompro, double precio) {
        super(cod, nompro, precio);
        this.nomInter = nomInter;
        this.nomCancion = nomCancion;
    }

    

    public String getNomInter() {
        return nomInter;
    }

    public void setNomInter(String nomInter) {
        this.nomInter = nomInter;
    }

    public String getNomCancion() {
        return nomCancion;
    }

    public void setNomCancion(String nomCancion) {
        this.nomCancion = nomCancion;
    }
    
    
     
}
