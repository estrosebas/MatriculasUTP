/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.develop.matriculas;


/**
 *
 * @author estrosebas
 */
//import libreria.*;
//import java.util.Date;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Matriculas {
    

    public static void main(String[] args) {
       // JOptionPane.showMessageDialog(null, "Mostrar tabla", null, 0);
       Object[] options = {"Listar", "Salir"};

        int respuesta = JOptionPane.showOptionDialog(null,
                "¿Qué acción deseas realizar?",
                "Opciones",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
                if (respuesta == 0) {
                    JOptionPane.showMessageDialog(null, "Has seleccionado 'Listar'.");
                     Login frame = new Login();
                     frame.setVisible(true);
                } else if (respuesta == 1) {
                    // Aquí puedes colocar el código para salir del programa.
                    JOptionPane.showMessageDialog(null, "Has seleccionado 'Salir'.");
                }
       
    }
}
