/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package anotherView;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class LoginView extends javax.swing.JPanel {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pwtxt = new javax.swing.JPasswordField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login Page");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jButton2.setText("Reset");
        jPanel1.add(jButton2);

        jButton1.setText("Login");
        jPanel1.add(jButton1);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Customer ID");
        jPanel2.add(jLabel2);

        idtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idtxtFocusLost(evt);
            }
        });
        idtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idtxtKeyTyped(evt);
            }
        });
        jPanel2.add(idtxt);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jPanel2.add(pwtxt);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idtxtKeyTyped
        char ch = evt.getKeyChar();
        if(ch<'0' || ch>'9') evt.setKeyChar('\0');
    }//GEN-LAST:event_idtxtKeyTyped

    private void idtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idtxtFocusLost
        String id = idtxt.getText();
        if(id.length()!=4){
            JOptionPane.showMessageDialog(this, "Please enter 4 digits String");
            idtxt.setText("");
            idtxt.requestFocus();
        }
    }//GEN-LAST:event_idtxtFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pwtxt;
    // End of variables declaration//GEN-END:variables
}
