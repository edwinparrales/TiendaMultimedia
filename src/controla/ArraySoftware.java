/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controla;

import java.util.ArrayList;
import modelo.CdSoftware;

/**
 *
 * @author UsuarioEp
 */
public class ArraySoftware {

    int cont;
    ArrayList<CdSoftware> acsdSoft = new ArrayList<CdSoftware>();
    ArrayList<CdSoftware> aux = new ArrayList<CdSoftware>();

    public ArraySoftware() {
        cont = 5;
        acsdSoft.add(new CdSoftware("Licencia 1", "Win7x32", "v2.2.3","co-999", "Sistema Pos", 500000));
        acsdSoft.add(new CdSoftware("yyyy-ffff-ffff", "win xp", " v1", "1", "Office2013", 120000));
        acsdSoft.add(new CdSoftware("yyyy-ddddd-ffff", "win 7", "v1", "2", "Norton", 120000));
        acsdSoft.add(new CdSoftware("yyyy-ffff-ddddd", "win 8", "v1", "3", "Corel", 120000));
        acsdSoft.add(new CdSoftware("yyyy-zzzzzz-ddd", "gnu/linux", "v1.1", "4", "Aranda", 120000));
        acsdSoft.add(new CdSoftware("yyyy-55555-ffff", "win vista", "v3.2", "5", "Macafi", 120000));
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public ArrayList<CdSoftware> getAcsdSoft() {
        return acsdSoft;
    }

    public void setAcsdSoft(ArrayList<CdSoftware> acsdSoft) {
        this.acsdSoft = acsdSoft;
    }

    public ArrayList<CdSoftware> getAux() {
        return aux;
    }

    public void setAux(ArrayList<CdSoftware> aux) {
        this.aux = aux;
    }

    public void agregaSoft(String licencia, String sisOperat, String version, String cod, String nompro, double precio) {

        acsdSoft.add(new CdSoftware(licencia, sisOperat, version, cod, nompro, precio));

        cont++;
    }

    public void buscar(int tp, String s) {

        for (int i = 0; i < acsdSoft.size(); i++) {
            if (tp == 1 && acsdSoft.get(i).getCodigo().equals(s)) {
                aux.add(acsdSoft.get(i));

            } else {
                if (tp == 2 && acsdSoft.get(i).getNombreProducto().equalsIgnoreCase(s)) {
                    aux.add(acsdSoft.get(i));
                }

            }
        }

    }

}
