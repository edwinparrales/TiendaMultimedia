/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controla;

import java.util.ArrayList;
import modelo.Cdmp3;

/**
 *
 * @author UsuarioEp
 */
public class ArrayCdmp3 {
    
   ArrayList<Cdmp3>arrmp3=new ArrayList<Cdmp3>();
   ArrayList<Cdmp3>aux;
   int cont;
    public ArrayCdmp3() {
       arrmp3.add(new Cdmp3("mark antony & La india","vivir lo nuestro","1", "Coleccin salsa", 50000));
       arrmp3.add(new Cdmp3("Hector lavo","El cantante","2", "Coleccin salsa", 60000));
       arrmp3.add(new Cdmp3("Ñejo flow","cuando me dira","3", "Coleccin crosover", 50000));
       arrmp3.add(new Cdmp3("Pipe pelaez","tan natural","1", "Coleccin vallenatos", 150000));
       arrmp3.add(new Cdmp3("Niky jeam","el perdon","50", "Regueaton", 60000));
       cont=5;
       aux=new ArrayList<Cdmp3>();
       
       
    }

    public ArrayList<Cdmp3> getArrmp3() {
        return arrmp3;
    }

    public void setArrmp3(ArrayList<Cdmp3> arrmp3) {
        this.arrmp3 = arrmp3;
    }

    public ArrayList<Cdmp3> getAux() {
        return aux;
    }

    public void setAux(ArrayList<Cdmp3> aux) {
        this.aux = aux;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    
    
    public void agregaDisco(String nomInter, String nomCancion, String cod, String nompro, double precio){
        
        arrmp3.add(new Cdmp3(nomInter, nomCancion, cod, nompro, precio));
        
        cont++;
    }
    
    public void buscar(int tp, String s) {

        for (int i = 0; i < arrmp3.size(); i++) {
            if (tp == 1 && arrmp3.get(i).getCod().equals(s)) {
                aux.add(arrmp3.get(i));

            } else {
                if (tp==2 && arrmp3.get(i).getNomCancion().equalsIgnoreCase(s)) {
                    aux.add(arrmp3.get(i));
                }
                
            }
        }
    }

    
        
    
    
}
