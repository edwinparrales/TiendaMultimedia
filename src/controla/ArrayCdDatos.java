/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controla;

import java.util.ArrayList;

import modelo.Cddatos;

/**
 *
 * @author UsuarioEp
 */
public class ArrayCdDatos {
    ArrayList<Cddatos>vecdDatos=new ArrayList<Cddatos>();
    ArrayList<Cddatos>aux=new ArrayList<Cddatos>();
    int cont;

    public ArrayCdDatos() {
        cont=3;
        vecdDatos.add(new Cddatos( 500f, "1", " Datos cd ", 20000));
        vecdDatos.add(new Cddatos( 400f, "2", " Respaldo Backup ", 80000));
        vecdDatos.add(new Cddatos( 500f, "3", "Recuperacion datos", 800000));
        vecdDatos.add(new Cddatos( 500f, "4", " Datos dvd ", 20000));
        cont++;
    }

    public ArrayList<Cddatos> getVecdDatos() {
        return vecdDatos;
    }

    public void setVecdDatos(ArrayList<Cddatos> vecdDatos) {
        this.vecdDatos = vecdDatos;
    }

    public ArrayList<Cddatos> getAux() {
        return aux;
    }

    public void setAux(ArrayList<Cddatos> aux) {
        this.aux = aux;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    public void agreCddatos(float tamaño, String cod, String nompro, double precio) {

        vecdDatos.add(new Cddatos(tamaño, cod, nompro, precio));

        cont++;
    }

    public void buscar(int tp, String s) {
            aux=new ArrayList<Cddatos>();
        for (int i = 0; i < vecdDatos.size(); i++) {
            if (tp == 1 && vecdDatos.get(i).getCodigo().equals(s)) {
                aux.add(vecdDatos.get(i));

            } else {
                if (tp == 2 && vecdDatos.get(i).getNombreProducto().equalsIgnoreCase(s)) {
                    aux.add(vecdDatos.get(i));
                }

            }
        }

    }
    
}
