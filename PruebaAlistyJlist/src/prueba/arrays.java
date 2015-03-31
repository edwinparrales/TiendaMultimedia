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
public class arrays {
    
   
    
    public static void main(String[] args) {
         ArrayList prueba = new ArrayList();
         ArrayList<Integer>numeros= new ArrayList<Integer>();
         Integer h=2;
       numeros.add(new Integer(h));
       numeros.add(h);
               
        prueba.add(h);
        prueba.add("paola");
        prueba.add(4);
        
        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(""+prueba.get(i));
            System.out.println("");
            System.err.println(""+numeros.get(i));
        }
        
    }
    
}
