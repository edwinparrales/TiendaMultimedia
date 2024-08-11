/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Cdmp3 {
    private String nomInter, nomCancion, cod, nompro;
    private double precio;

    public Cdmp3(String nomInter, String nomCancion, String cod, String nompro, double precio) {
        this.nomInter = nomInter;
        this.nomCancion = nomCancion;
        this.cod = cod;
        this.nompro = nompro;
        this.precio = precio;
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

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNompro() {
        return nompro;
    }

    public void setNompro(String nompro) {
        this.nompro = nompro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

  
    
}
