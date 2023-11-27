/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import Entidad.Alumno;
import Datos.AlumnoDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author estrosebas
 */
public class eliminarAlumno extends javax.swing.JFrame {

    /**
     * Creates new form eliminarAlumno
     */
    public eliminarAlumno() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        id_Alumno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buscarDni = new javax.swing.JTextField();
        nom_Alu = new javax.swing.JTextField();
        ape_PAl = new javax.swing.JTextField();
        ape_MAl = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Eliminar Alumno");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 12, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 290, 11));
        jPanel2.add(id_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 0, 39, 29));

        jLabel3.setText("Ingrese el dni :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, -1, -1));

        jLabel4.setText("Nombre :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, -1, -1));

        jLabel5.setText("Apellido Paterno :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 112, -1, -1));

        jLabel6.setText("Apellido Materno :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 140, -1, -1));
        jPanel2.add(buscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 35, 89, -1));
        jPanel2.add(nom_Alu, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 81, 222, -1));
        jPanel2.add(ape_PAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 109, 174, -1));
        jPanel2.add(ape_MAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 137, 174, -1));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 35, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 170));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 90, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backe.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menuunitario back = new menuunitario();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        buscarAlumno();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void buscarAlumno() {
        try {
            int dni = Integer.parseInt(buscarDni.getText()); // Asegúrate de manejar NumberFormatException
            AlumnoDAO aluDAO = new AlumnoDAO();
            Alumno alumno = new Alumno();
            alumno = aluDAO.buscarAlumnoPorDni(dni);
            if (alumno != null) {
                // Rellenar los campos con la información del alumno
                nom_Alu.setText(alumno.getNom_Alu());
                ape_PAl.setText(alumno.getApe_PAl());
                ape_MAl.setText(alumno.getApe_MAl());
                id_Alumno.setText(Integer.toString(alumno.getId_Alumno()));
            } else {
                JOptionPane.showMessageDialog(this, "Alumno no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminar() {
        String dniAlumno = buscarDni.getText();
        if (dniAlumno.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el DNI del alumno a eliminar.");
        } else {
            // Crear una instancia de AlumnoDAO y llamar al método eliminarPorDNI
            AlumnoDAO dao = new AlumnoDAO();
            int dniAlumnoParse = Integer.parseInt(dniAlumno);
            boolean result = dao.eliminar(dniAlumnoParse);

            if (result) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado con éxito.");
                // Actualizar la lista o tabla aquí
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el alumno o está matriculado.");
            }
        }

        // Limpiar el campo de texto independientemente del resultado
        buscarDni.setText("");
        nom_Alu.setText("");
        ape_PAl.setText("");
        ape_MAl.setText("");
        id_Alumno.setText("");
    }

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
            java.util.logging.Logger.getLogger(eliminarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ape_MAl;
    private javax.swing.JTextField ape_PAl;
    private javax.swing.JTextField buscarDni;
    private javax.swing.JTextField id_Alumno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nom_Alu;
    // End of variables declaration//GEN-END:variables
}
