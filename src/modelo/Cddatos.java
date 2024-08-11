/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Cddatos {
    private float size;
    private String codigo, nombreProducto; 
    private  double precio;

    public Cddatos(float size, String codigo, String nombreProducto, double precio) {
        this.size = size;
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }
    
    
 
    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  
    
}
