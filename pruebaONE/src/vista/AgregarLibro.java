/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author santiago
 */
public class AgregarLibro extends javax.swing.JFrame {

    /**
     * Creates new form AgregarLibro
     */
    public AgregarLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxBestseller = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButtonCargarImagen = new javax.swing.JButton();
        jTextFieldCargarImagen = new javax.swing.JTextField();
        jLabelImagen = new javax.swing.JLabel();
        jButtonCargartxt = new javax.swing.JButton();
        jTextFieldCargarLibro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelMostrastxt = new javax.swing.JLabel();
        jButtonAgregar = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jComboBoxRangoEdad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonResumen = new javax.swing.JButton();
        jTextFieldSinopsis = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jCheckBoxBestseller, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Bestseller?:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 150, 20));

        jButtonCargarImagen.setBackground(new java.awt.Color(0, 0, 153));
        jButtonCargarImagen.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButtonCargarImagen.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCargarImagen.setText("Cargar Portada");
        jButtonCargarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarImagenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jTextFieldCargarImagen.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        getContentPane().add(jTextFieldCargarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 250, -1));

        jLabelImagen.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 100, 80));

        jButtonCargartxt.setBackground(new java.awt.Color(0, 0, 153));
        jButtonCargartxt.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButtonCargartxt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCargartxt.setText("Cargar Libro");
        jButtonCargartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargartxtActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCargartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jTextFieldCargarLibro.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        getContentPane().add(jTextFieldCargarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, -1));

        jPanel1.add(jLabelMostrastxt);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 180, 120));

        jButtonAgregar.setBackground(new java.awt.Color(0, 0, 153));
        jButtonAgregar.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jButtonAtras.setBackground(new java.awt.Color(51, 0, 153));
        jButtonAtras.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jComboBoxRangoEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6-10", "10-14", "14-18", "+18", " " }));
        getContentPane().add(jComboBoxRangoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rango de edad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Genero:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 250, -1));

        jButtonResumen.setBackground(new java.awt.Color(0, 0, 204));
        jButtonResumen.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResumen.setText("Cargar sinopsis");
        jButtonResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResumenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        getContentPane().add(jTextFieldSinopsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 250, -1));

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Misterio", "Fantasia", "Terror", "Ficcion", "Aventura", "Erotico", " " }));
        getContentPane().add(jComboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        fondo.setFont(new java.awt.Font("URW Palladio L", 0, 18)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoApp.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 655, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCargarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarImagenActionPerformed
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);  // Abre la ventana de dialogo
        if(option == JFileChooser.APPROVE_OPTION){  // Si hace clic en el boton
            String file = dlg.getSelectedFile().getPath();  //Obtiene el nombre y direccion del archivo
            
            jTextFieldCargarImagen.setText("Archivo: " + file);
            jLabelImagen.setIcon(new ImageIcon(file)); 
        }
    }//GEN-LAST:event_jButtonCargarImagenActionPerformed
    
    /*public String AbrirArchivo(File archivo){
        FileInputStream entrada;
        String documento = "";
        try{
            entrada = new FileInputStream(archivo);
            int as;
            while((as=entrada.read()) != -1){
                char caracter = (char)as;
                documento += caracter;
            }
        }catch(Exception e){
        }
        
        return documento;
    }*/
    
    private void jButtonCargartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargartxtActionPerformed
        
        /*JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String file = dlg.getSelectedFile().getPath();
           
            File fil= dlg.getSelectedFile();
            
            jTextFieldCargarLibro.setText(file);
            //jLabelMostrastxt.setText(file);
            
            if(fil.canRead()){
                if(fil.getName().endsWith("txt")){
                    String documento = AbrirArchivo(fil);
                    jLabelMostrastxt.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            }
        }*/
        
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){  // Si hace clic en el boton
            String file = dlg.getSelectedFile().getPath();  //Obtiene el nombre y direccion del archivo
            
            jTextFieldCargarLibro.setText("Archivo: " + file);
        }
    }//GEN-LAST:event_jButtonCargartxtActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        VistaAdmin a = new VistaAdmin();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResumenActionPerformed
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            String file = dlg.getSelectedFile().getPath();
            
            jTextFieldSinopsis.setText("Archivo: " + file);
        }
    }//GEN-LAST:event_jButtonResumenActionPerformed
    
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCargarImagen;
    private javax.swing.JButton jButtonCargartxt;
    private javax.swing.JButton jButtonResumen;
    private javax.swing.JCheckBox jCheckBoxBestseller;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxRangoEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelMostrastxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCargarImagen;
    private javax.swing.JTextField jTextFieldCargarLibro;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldSinopsis;
    // End of variables declaration//GEN-END:variables
}
