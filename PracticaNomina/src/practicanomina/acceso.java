/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanomina;

import javax.swing.JOptionPane;


/**
 *
 * @author OMAR
 */
public class acceso extends javax.swing.JFrame {

    /**
     * Creates new form acceso
     */
    public acceso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        txtUSuario = new javax.swing.JTextField();
        pssContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        labelUsuario.setText("USUARIO:");
        getContentPane().add(labelUsuario);
        labelUsuario.setBounds(100, 120, 69, 14);

        labelContraseña.setText("CONTRASEÑA:");
        getContentPane().add(labelContraseña);
        labelContraseña.setBounds(100, 170, 108, 14);

        txtUSuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUSuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUSuario);
        txtUSuario.setBounds(260, 100, 160, 40);

        pssContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(pssContraseña);
        pssContraseña.setBounds(260, 160, 160, 40);

        btnAcceder.setText("ACCEDER");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceder);
        btnAcceder.setBounds(270, 230, 130, 40);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 30, 150, 14);

        labelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\OMAR\\Desktop\\imagenes\\fondofo.png")); // NOI18N
        labelFondo.setMaximumSize(new java.awt.Dimension(500, 400));
        labelFondo.setMinimumSize(new java.awt.Dimension(500, 400));
        labelFondo.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(labelFondo);
        labelFondo.setBounds(0, 0, 625, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void txtUSuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUSuarioActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        String usuario="eli";
        String contra="1234";
        String pass = new String (pssContraseña.getPassword());
        if(txtUSuario.getText().equals(usuario)&&pass.equals(contra))
        {
            Lista acceso = new Lista (true); 
            acceso.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña incorrecta");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccederActionPerformed

    
    
    private void pssContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pssContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pssContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JPasswordField pssContraseña;
    private javax.swing.JTextField txtUSuario;
    // End of variables declaration//GEN-END:variables
}
