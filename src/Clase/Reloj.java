/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

import java.util.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Reloj implements Runnable {

    String hora, minuto, segundo, AmPm;
    JLabel labelReloj;
    Calendar calendario;
    public Thread hilo1;

    public Reloj(JLabel labelReloj) {
        this.labelReloj = labelReloj;
        hilo1 = new Thread(this);
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == hilo1) {
            calcula();
            labelReloj.setText(hora + ":" + minuto + ":" + segundo + " " + AmPm);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    public Thread getHilo1() {
        return hilo1;
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        AmPm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (AmPm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

}
