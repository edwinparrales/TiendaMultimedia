/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;

/**
 *
 * @author UsuarioEp
 */
public class  Principal {
    ArrayList<Cdmp3>arrmp3=new ArrayList<Cdmp3>();
    ArrayList<Cdmp3>aux=new ArrayList<Cdmp3>();
    public Principal() {
        arrmp3.add(new Cdmp3("1", " vivir lo nuestro ", " Mark a", "salsa", 50500));
        arrmp3.add(new Cdmp3("2", " volare ", " son boricua ", "salsa", 5000));
        arrmp3.add(new Cdmp3("3", " me fallasre  ", " Eddie Santiago ", "salsa", 50500));
        arrmp3.add(new Cdmp3("4", " che che cole ", " Tego ", "salsa", 50500));
        
        
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
    
    
    
    
   
    public void agregar(String codigo, String nomCanci, String nombInterpr, String genero, double valor){
        this.arrmp3.add(new Cdmp3(codigo, nomCanci, nombInterpr, genero, valor));
        }
    public void buscar(int tipo,String n){
        
        for (int i = 0; i < arrmp3.size(); i++) {
            if (tipo==1 && n.equalsIgnoreCase(arrmp3.get(i).getNomCanci())) {
                  aux.add(arrmp3.get(i));
                
            } else {
            }
            
        }
        
    }
    
  
}
