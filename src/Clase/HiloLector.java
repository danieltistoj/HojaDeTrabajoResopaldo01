/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase;

import java.io.InputStream;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HiloLector extends Thread{
    private final InputStream is;

    public HiloLector(InputStream is) {
        this.is = is;
    }
    @Override
    public void run(){
        try {
            byte[] buffer = new byte[1000];
            int leido = is.read(buffer);
            while(leido > 0){
                String texto = new String(buffer,0,leido);
                System.out.println(texto);
                leido = is.read(buffer);
                
            }
        } catch (Exception e) {
            System.out.println(e.toString() );
        }
    }
}
