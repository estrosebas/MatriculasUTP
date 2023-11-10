/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.develop.matriculas;

/**
 *
 * @author estrosebas
 */
import libreria.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Alumnos extends javax.swing.JFrame {

    conexiones con1 = new conexiones();  // Esto debería funcionar ahora
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    String Correo;
    String Contraseña;

    public Alumnos() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Registrar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        modificar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 100));

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        modificar1.setText("Modificar");
        modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addComponent(Regresar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(Registrar)
                    .addComponent(modificar1)
                    .addComponent(jButton2)
                    .addComponent(Regresar)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 610, 40));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido materno", "Apellido paterno", "Dni"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 6, 615, 265));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backe.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -4, 640, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        MenuPrincipal Menu = new MenuPrincipal();
        Menu.setVisible(true);
        this.setVisible(false); // Oculta el JFrame actual
        
    }//GEN-LAST:event_RegresarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

        String dniStr = JOptionPane.showInputDialog(this, "Ingrese DNI del Alumno:");
        int dni = Integer.parseInt(dniStr);  // Convertir la entrada a int. Podría lanzar NumberFormatException.
        String nombre = JOptionPane.showInputDialog(this, "Ingrese Nombre del Alumno:");
        String apellidoPaterno = JOptionPane.showInputDialog(this, "Ingrese Apellido Paterno del Alumno:");
        String apellidoMAterno = JOptionPane.showInputDialog(this, "Ingrese Apellido Materno del Alumno:");
        String fechaNacStr = JOptionPane.showInputDialog(this, "Ingrese Fecha de Nacimiento del Alumno (AAAA-MM-DD):");
        java.util.Date fechaNac = java.sql.Date.valueOf(fechaNacStr);  // Convertir la entrada a Date. Podría lanzar IllegalArgumentException.
        String sexo = JOptionPane.showInputDialog(this, "Ingrese el sexo del estudiante");
        String Id_distritoAlumStr = JOptionPane.showInputDialog(this, "Seleccione el distrito del estudiante");
        int Id_distriroAlum = Integer.parseInt(Id_distritoAlumStr);
        String Domicilio = JOptionPane.showInputDialog(this, "Ingrese la direccion de residencia del estudiante");
        String Nivel_ing = JOptionPane.showInputDialog(this, "Ingrese el nivvel de ingreso(inicial,primaria,secudnaria)");
        String[] options = {"Inicial", "Primaria", "Secundaria"};
        int selection = JOptionPane.showOptionDialog(
                null,
                "Seleccione el nivel de ingreso",
                "Nivel de Ingreso",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        if (selection == JOptionPane.CLOSED_OPTION) {
            return; // Salir del bloque si el usuario cerró el diálogo
        }

        Nivel_ing = options[selection];
        String Grado_ingStr = JOptionPane.showInputDialog(this, "Ingrese grado de ingreso del alumno:");
        int Grado_ing = Integer.parseInt(Grado_ingStr);
        String Colegio_ant = JOptionPane.showInputDialog(this, "Ingrese colegio de procedencia");
        String Id_habilidadStr = JOptionPane.showInputDialog(this, "Seleccione la habildiad");
        int Id_habilidad = Integer.parseInt(Id_habilidadStr);
        String Id_RepreStr = JOptionPane.showInputDialog(this, "Ingrese Id del representante");
        int Id_Repre = Integer.parseInt(Id_RepreStr);
        String Relacion = JOptionPane.showInputDialog(this, "Ingrese la relacion del representatne");
        Alumno alumno = new Alumno(dni, nombre, apellidoPaterno, apellidoMAterno, fechaNac, sexo, Id_distriroAlum, Domicilio, Nivel_ing, Grado_ing, Colegio_ant, Id_habilidad, Id_Repre, Relacion);
        AlumnoDAO alumnosDAO = new AlumnoDAO();
        boolean registroExitoso = alumnosDAO.insertar(alumno);
        
        if (registroExitoso) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
        } else {
            JOptionPane.showMessageDialog(this, "Error en el registro");
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarAlumno frame = new buscarAlumno();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarAlumno frame = new eliminarAlumno();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar1ActionPerformed
        
    }//GEN-LAST:event_modificar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    void consultar() {
        // Crear una instancia de AlumnoDAO
        AlumnoDAO alumnoDAO = new AlumnoDAO();

        // Obtener la lista de todos los alumnos
        List<Alumno> listaAlumnos = alumnoDAO.obtenerTodosLosAlumnos();

        // Limpia las filas existentes en la tabla
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        // Iterar sobre la lista de alumnos y agregarlos a la tabla
        for (Alumno alumno : listaAlumnos) {
            Object[] estudiante = new Object[]{
                alumno.getId_Alumno(),
                alumno.getNom_Alu(),
                alumno.getApe_MAl(),
                alumno.getApe_PAl(),
                alumno.getDni_Alumno()
            };
            modelo.addRow(estudiante);
        }

        Tabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar1;
    // End of variables declaration//GEN-END:variables
}
