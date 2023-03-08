/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package puzzle;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class xephinh extends javax.swing.JFrame {

    private int size = 3;
    private JButton[][] matrix;
//    private int kichTh=3;
    
    public xephinh() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.addButton();
    }

    public xephinh(int kth) {
        initComponents();
        this.setLocationRelativeTo(this);
        this.size = kth;
        this.addButton();
    }
    
    public void addButton(){
//        size = this.jComboBox1.getSelectedIndex()+kt;
        this.jPanel1.setLayout(new GridLayout(size,size,10,10));
        
        this.jPanel1.setPreferredSize(new Dimension(60*size,60*size));
        System.out.println(size);
        matrix = new JButton[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JButton bu = new JButton(i*size+j+1+"");
                matrix[i][j] = bu;
                this.jPanel1.add(bu);
                bu.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(checkMove(bu)){
                            moveButton(bu);
                            if(checkWin()){
                                JOptionPane.showMessageDialog(null, "You Win!");
                            }
                        }
                    }
                });
            }
        }
        this.pack();
        matrix[size-1][size-1].setText("");
        mixButton();
    }
    
    public Point getPosition(){
        for(int i=0; i<size; i++){
            for(int j =0; j< size; j++){
                if(matrix[i][j].getText().equals("")) return new Point(i, j);
            }
        }
        return null;
    }
    
    public void mixButton(){
        for(int k=0; k<1000; k++){
            Point p = getPosition();
            int i= p.x;
            int j= p.y;
            
            Random ra = new Random();
            int choice = ra.nextInt(4);
            
            switch(choice){
                case 0: //up
                    if(i>0){
                       String tempt = matrix[i-1][j].getText();
                       matrix[i][j].setText(tempt);
                       matrix[i-1][j].setText("");
                    }
                    break;
                case 1: //down
                    if(i<size -1){
                       String tempt = matrix[i+1][j].getText();
                       matrix[i][j].setText(tempt);
                       matrix[i+1][j].setText("");
                    }
                    break;
                case 2: // left
                    if(j>0){
                        String tempt = matrix[i][j-1].getText();
                        matrix[i][j].setText(tempt);
                        matrix[i][j-1].setText("");
                    }
                    break;
                case 3:
                    if(j<size -1 ){
                        String tempt = matrix[i][j+1].getText();
                        matrix[i][j].setText(tempt);
                        matrix[i][j+1].setText("");
                    }
                    break;
            }
        }
    }
    
    public boolean checkMove(JButton b){
        Point p = getPosition(); int i1=0,j1=0;
        // dùng loop duyệt để lấy tọa độ của b theo index matrix bởi vì index của p cx theo matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(matrix[i][j].getText().equals(b.getText())){
                    i1 = i; 
                    j1 = j;
                    break;
                }
            }
        }
        
        if(p.x == i1 && Math.abs(p.y - j1) == 1) return true;
        if(p.y == j1 && Math.abs(p.x - i1)==1) return true;
        return false;
    }
    
    public void moveButton(JButton b){
        Point p = getPosition();
        String tempt = b.getText();
        matrix[p.x][p.y].setText(tempt);
        b.setText("");
    }
    
    public boolean checkWin(){
        if(matrix[size-1][size-1].getText().equals("")){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(i == size -1 && j == size -1) return true;
                    if(!matrix[i][j].getText().equals(i*3 + j + 1 + "")) return false;
                }
            }
            return true;
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 260, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("jLabel10");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3x3", "4x4", "5x5" }));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton2)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(46, 46, 46)
                                    .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(36, 36, 36)
                                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(36, 36, 36)
                                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(57, 57, 57)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jLabel7))
                .add(53, 53, 53)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jLabel9))
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 26, Short.MAX_VALUE)
                .add(jButton2)
                .add(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sz = this.jComboBox1.getSelectedIndex()+3;
        xephinh xh = new xephinh(sz);
        xh.setVisible(true);
        xh.jComboBox1.setSelectedIndex(this.jComboBox1.getSelectedIndex());
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(xephinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xephinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xephinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xephinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xephinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
