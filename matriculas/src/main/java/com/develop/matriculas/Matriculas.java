/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.develop.matriculas;

/**
 *
 * @author estrosebas
 */
import javax.swing.JOptionPane;
//import libreria.*;
//import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Matriculas {

    public static void main(String[] args) {
        //    Alumno alumno2 = new Alumno("1ro Primaria", "Colegio Particular Mixteco", "Los Olivos",
        //"Perez", "Gomez", "Juan Jose", new Date(), "Lima", "Av. Central 123",
        //"12345678", "Católico", "98765432", "14725836");
        //System.out.println("creado: \n "+ alumno2.toString());
        //JOptionPane.showMessageDialog(null, alumno2.toString(), "Alumno", 0);
        String jdbcURL = "jdbc:mysql://localhost:3306/matriculas";
        String usuario = "root";
        String contraseña = "";
        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(jdbcURL, usuario, contraseña);
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Consulta SQL para obtener datos de la tabla alumno_datos_basicos
                String consulta = "SELECT * FROM alumno_datos_basicos";
                PreparedStatement statement = conexion.prepareStatement(consulta);

                // Ejecutar la consulta y obtener el resultado en un ResultSet
                ResultSet resultSet = statement.executeQuery();

                // Recorrer los resultados y mostrarlos (puedes adaptar esto según tus necesidades)
                while (resultSet.next()) {
                    int id = resultSet.getInt("ID_Alumno");
                    String Grado_2023 = resultSet.getString("Grado_2023");
                    String Colegio_Origen = resultSet.getString("Colegio_Origen");
                    String Distrito = resultSet.getString("Distrito");
                    String Apellido_Paterno = resultSet.getString("Apellido_Paterno");
                    String Apellido_Materno = resultSet.getString("Apellido_Materno");
                    String Nombres = resultSet.getString("Nombres");
                    String Fecha_Nacimiento = resultSet.getString("Fecha_Nacimiento");
                    String Lugar_Nacimiento = resultSet.getString("Lugar_Nacimiento");
                    String Direccion_Domicilio = resultSet.getString("Direccion_Domicilio");
                    String DNI = resultSet.getString("DNI");
                    String Religión = resultSet.getString("Religión");
                    String DNI_Padre = resultSet.getString("DNI_Padre");
                    String DNI_Madre = resultSet.getString("DNI_Madre");

                    // Agregar más campos según la estructura de tu tabla
                    String resultado = "ID: " + id
                            + ",\n Grado_2023: " + Grado_2023
                            + ",\n Colegio_Origen: " + Colegio_Origen
                            + ",\n Distrito: " + Distrito
                            + ",\n Apellido_Paterno: " + Apellido_Paterno
                            + ",\n Apellido_Materno: " + Apellido_Materno
                            + ",\n Nombres: " + Nombres
                            + ",\n Fecha_Nacimiento: " + Fecha_Nacimiento
                            + ",\n Lugar_Nacimiento: " + Lugar_Nacimiento
                            + ",\n Direccion_Domicilio: " + Direccion_Domicilio
                            + ",\n DNI: " + DNI
                            + ",\n Religión: " + Religión
                            + ",\n DNI_Padre: " + DNI_Padre
                            + ",\n DNI_Madre: " + DNI_Madre;
                    //System.out.println(resultado); 
                    JOptionPane.showMessageDialog(null, resultado, "Alumno", id);
                }
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
        }
    }
}
