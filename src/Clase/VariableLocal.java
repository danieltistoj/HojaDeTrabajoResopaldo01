/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import conexionbase.ConexionMySQL;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VariableLocal {

    public ConexionMySQL conexionMySQL;
    private String puerto, usuario, contra, baseDatos;

    public VariableLocal() {
        conexionMySQL = new ConexionMySQL("3305", "hoja2base2", "root", "xela2020");
        this.baseDatos = "hoja2base2";
        this.usuario = "root";
        this.contra = "xela2020";
        this.puerto = "3305";
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContra() {
        return contra;
    }

}
