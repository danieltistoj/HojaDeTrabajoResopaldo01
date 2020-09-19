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
public class Exportar {
        private String ruta, nombreRespaldo, comando, usuario,contra,baseDatos;
        
    public Exportar(String contra,String usuario,String baseDatos) {
        this.usuario = usuario;
        this.contra = contra;
        this.baseDatos = baseDatos;
        this.nombreRespaldo = "\\baseRespaldo.sql";
    }
    public void ExportarBase(){
        if(ruta.length()!=0){
            try {
                comando = "mysqldump --opt -u "+usuario+" -p"+contra+" -B "+baseDatos+" -r "+ruta+nombreRespaldo;
                System.out.println(comando);
                Runtime rt = Runtime.getRuntime();
                rt.exec(comando);
                JOptionPane.showMessageDialog(null,"Se exporto el archivo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al exportar","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
   
    
}
