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
   ArrayList<Cdmp3>aux=new ArrayList<Cdmp3>();

    public ArrayCdmp3() {
       arrmp3.add(new Cdmp3(" mark antony & La india","vivir lo nuestro"," 1", " Coleccin salsa ", 50000f));
       arrmp3.add(new Cdmp3("Hector lavo","El cantante "," 2", " Coleccin salsa ", 60000f));
       arrmp3.add(new Cdmp3(" Ñejo flow"," cuando me dira"," 3", " Coleccin crosover ", 50000f));
       arrmp3.add(new Cdmp3("Pipe pelaez"," tan natural "," 1", " Coleccin vallenatos ", 150000f));
       arrmp3.add(new Cdmp3(" Niky jeam "," el perdon","50", " Regueaton ", 60000f));
         
    }
    
    public void agregaDisco(){
        
        
        
        
    }
    
}
