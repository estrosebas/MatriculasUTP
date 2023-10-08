/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.develop.matriculas;

import java.util.List;

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

public class Matriculas {
    

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = Alumno.listarAlumnos();
        for (Alumno alumno : listaAlumnos) {
            //System.out.println("ID: " + alumno.getId());
            System.out.println("Grado 2023: " + alumno.getGrado_2023());
            System.out.println("Colegio de Origen: " + alumno.getColegio_Origen());
            // Imprimir otros atributos o realizar otras operaciones
        }
    }
}
