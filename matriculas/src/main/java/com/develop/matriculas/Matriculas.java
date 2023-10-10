/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.develop.matriculas;


/**
 *
 * @author estrosebas
 */
import libreria.*;
//import java.util.Date;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List;

public class Matriculas {

    public static void main(String[] args) {
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
            
            AlumnoDAO alumnoDAO = new AlumnoDAO();
            List<Alumno> alumnos = alumnoDAO.obtenerTodosLosAlumnos();

            StringBuilder mensaje = new StringBuilder("Lista de Alumnos:\n");
            for (Alumno alumno : alumnos) {
                mensaje.append(alumno.getDni_Alumno()).append("\n");
            }
            
            JOptionPane.showMessageDialog(null, mensaje.toString());

            // Login frame = new Login();  
            // Comentado ya que mencionaste que Login no está presente por ahora
            // frame.setVisible(true);

        } else if (respuesta == 1) {
            JOptionPane.showMessageDialog(null, "Has seleccionado 'Salir'.");
        }
    }
}