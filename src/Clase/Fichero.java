/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Fichero {

    String rutaExportar, baseDatos, horaEjecucion, ficheroRuta, ficheroBase, ficheroHora;

    public  Fichero(){
        this.ficheroRuta = "ruta.txt";
        this.ficheroBase = "baseDatos.txt";
        this.ficheroHora = "hora.txt";
        obtenerBaseDatos();
        obterRuta();
        obtenerHora();

    }

    public String getRutaExportar() {
        return rutaExportar;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public String getHoraEjecucion() {
        return horaEjecucion;
    }

    public void obterRuta() {
        String cadena = "";
        int caracter;
        try {
            FileReader fr = new FileReader("src\\Fichero\\"+ficheroRuta);
            caracter = fr.read();
            while (caracter != -1) {
                cadena += (char) caracter;
                caracter = fr.read();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.rutaExportar = cadena;

    }

    public void obtenerBaseDatos(){
        String cadena = "";
        int caracter = 0;
        try {
            FileReader fr = new FileReader("src\\Fichero\\"+ficheroBase);
           
                caracter = fr.read();
           
            while (caracter != -1) {
                cadena += (char) caracter;

                    caracter = fr.read();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.baseDatos = cadena;

    }
    public void obtenerHora(){
        String cadena = "";
        int caracter = 0;
        try {
            FileReader fr = new FileReader("src\\Fichero\\"+ficheroHora);
           
                caracter = fr.read();
           
            while (caracter != -1) {
                cadena += (char) caracter;

                    caracter = fr.read();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.horaEjecucion = cadena;
    }

}
