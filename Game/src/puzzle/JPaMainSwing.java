/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
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
public class JPaMainSwing extends javax.swing.JPanel {

    
    private int size = 0;
    private JButton[][] matrix;
    
    public JPaMainSwing() {
        initComponents();
        this.addButton();
    }

    public void addButton(){
        size = this.jComboBox1.getSelectedIndex()+5;
        this.jPanel1.setLayout(new GridLayout(size,size,10,10));
        
        this.jPanel1.setPreferredSize(new Dimension(60*size,120*size));
        System.out.println(size);
        matrix = new JButton[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                JButton bu = new JButton(i*3+j+1+"");
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 287, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jLabel2)
                    .add(jLabel1))
                .add(73, 73, 73)
                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(46, 46, 46)
                .add(jLabel1)
                .add(32, 32, 32)
                .add(jLabel2)
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
