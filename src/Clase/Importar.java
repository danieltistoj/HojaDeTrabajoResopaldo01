/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clase;

import javax.swing.JOptionPane;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Importar {
    private String ruta, comando, usuario,contra,baseDatos;
        
    public Importar(String contra,String usuario,String baseDatos) {
        this.usuario = usuario;
        this.contra = contra;
        this.baseDatos = baseDatos;
    }
    public void ImportarBase(){
        if(ruta.length()!=0){
            try {
                comando = "mysqldump --opt -u "+usuario+" -p"+contra+" -B "+baseDatos+" -r "+ruta;
                Runtime rt = Runtime.getRuntime();
                rt.exec(comando);
                JOptionPane.showMessageDialog(null,"Se importo la base de datos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al importar","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
  
}
