/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.develop.matriculas;

import Formulario.*;
import Datos.*;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author estrosebas
 */
import Entidad.*;
import Datos.*;

public class Main {

    public static void main(String[] args) {
        conexiones conec = new conexiones();
        String elec =conec.leerOpcionConexionDesdeArchivo();
        System.out.println(elec);
        if(elec.equals("local")){
            Boolean chan = conec.verificarConexionLocal();
            if(chan == false){
                JOptionPane.showMessageDialog(null, "Base local no disponible, cambiando a servidor");
                conec.cambiarServidor();
            }
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                iniciarInterfazGrafica();
            }
        });
            
        
    }
    private static void iniciarInterfazGrafica() {
        //menuunitario menu = new menuunitario();
        login loger = new login();
        loger.setVisible(true);
    }
}
