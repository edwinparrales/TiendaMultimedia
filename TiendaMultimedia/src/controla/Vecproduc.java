/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controla;

import javax.swing.JOptionPane;
import modelo.Cdaudio;

/**
 *
 * @author UsuarioEp
 */
public class Vecproduc {

    Cdaudio cd[];
    Cdaudio[] aux;
    int c;

    public Vecproduc() {
        cd = new Cdaudio[10];
        c = 0;
        aux = new Cdaudio[10];
    }

    public Cdaudio[] getCd() {
        return cd;
    }

    public void setCd(Cdaudio[] cd) {
        this.cd = cd;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    //vector auxiliar

    public Cdaudio[] getAux() {
        return aux;
    }

    public void setAux(Cdaudio[] aux) {
        this.aux = aux;
    }

    public void ingCd(String nomInter, String nomCancion, String cod, String nompro, double precio) {

        cd[c] = new Cdaudio(nomInter, nomCancion, cod, nompro, precio);
        c++;
        setCd(cd);
    }

    public void buscar(int tipo, String n) {
      
        if (tipo == 1) {
            for (int i = 0; i < aux.length; i++) {
                if (cd[i] != null && cd[i].getNomCancion().equalsIgnoreCase(n)) {
                    aux[i] = cd[i];
                    
                }
            }
                setAux(aux);
            
            
        } else {
            if (tipo == 2) {
                for (int i = 0; i < aux.length; i++) {
                    if (cd[i] != null && cd[i].getCod().equalsIgnoreCase(n)) {
                        aux[i] = cd[i];
                   

                    }

                }
                  setAux(aux);
            }

        }
      
    }

}
