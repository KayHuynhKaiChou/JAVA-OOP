/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Product;
import Model.ShopProduct;
import Model.VolumnProduct;
import Model.WeightProduct;
import controller.ConvertSwingFunction;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class newProductJP extends javax.swing.JPanel {
    private ShopProduct sh;
    
    public newProductJP() {
        initComponents();
        this.sh = ConvertSwingFunction.shop;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbName = new javax.swing.JLabel();
        jlbID = new javax.swing.JLabel();
        jlbNSX = new javax.swing.JLabel();
        jlbHSD = new javax.swing.JLabel();
        jlbPrice = new javax.swing.JLabel();
        jlbQuantity = new javax.swing.JLabel();
        jlbV = new javax.swing.JLabel();
        jlbM = new javax.swing.JLabel();
        jtfNSX = new javax.swing.JTextField();
        jtfID = new javax.swing.JTextField();
        jtfName = new javax.swing.JTextField();
        jtfHSD = new javax.swing.JTextField();
        jtfPrice = new javax.swing.JTextField();
        jtfQuantity = new javax.swing.JTextField();
        jtfVolume = new javax.swing.JTextField();
        jtfMass = new javax.swing.JTextField();
        jlbTitle = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(153, 255, 204));

        jlbName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbName.setText("Name Product");
        jlbName.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbID.setText("ID");
        jlbID.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbNSX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbNSX.setText("NSX");
        jlbNSX.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbHSD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbHSD.setText("HSD");
        jlbHSD.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbPrice.setText("Price");
        jlbPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbQuantity.setText("Quantity");
        jlbQuantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbV.setText("Volume(ml)");
        jlbV.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jlbM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbM.setText("Mass(g)");
        jlbM.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));

        jtfNSX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNSXActionPerformed(evt);
            }
        });

        jtfID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNameActionPerformed(evt);
            }
        });

        jtfHSD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfVolume.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfMass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfMass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMassActionPerformed(evt);
            }
        });

        jlbTitle.setBackground(new java.awt.Color(255, 255, 102));
        jlbTitle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jlbTitle.setText("New Product Information");
        jlbTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jlbTitle.setOpaque(true);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Note:\n\n+ ID: Not Similar with existed ID , include character \nand number . ex: SP12, P20,.... NOT SP, NOT 123\n\n+ Name Product: is not blank or empty .ex: Pepsi,\nSevenup,....\n\n+ NSX,HSD : is a string with size = 8 , after 2 digits\nis a dot, is correct principle date . ex: 03.02.20 \nand NOT 030220 , NOT 39.04.21\n\n+Price : just number . ex: 5000 , 10000,....\n\n+Quantity : just Integer number 0-->1000 . ex:\n20,30,....\n\n+ Volume(ml),Mass(g) : Just number. ex: 240, 560,...\n");
        jScrollPane1.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(80, 80, 80)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jlbHSD)
                        .add(39, 39, 39)
                        .add(jlbTitle))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jlbPrice)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(jlbNSX, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jlbName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jlbID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(jlbQuantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jlbV)
                            .add(jlbM))
                        .add(50, 50, 50)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jButtonAdd)
                                .add(43, 43, 43)
                                .add(jButtonReset))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(jtfName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .add(jtfNSX)
                                .add(jtfID, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .add(jtfHSD)
                                .add(jtfPrice)
                                .add(jtfQuantity)
                                .add(jtfVolume)
                                .add(jtfMass)))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 63, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 272, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(35, 35, 35)
                .add(jlbTitle)
                .add(51, 51, 51)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbID)
                            .add(jtfID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(32, 32, 32)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbName)
                            .add(jtfName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(29, 29, 29)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbNSX)
                            .add(jtfNSX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(32, 32, 32)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbHSD)
                            .add(jtfHSD, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(32, 32, 32)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbPrice)
                            .add(jtfPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(33, 33, 33)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbQuantity)
                            .add(jtfQuantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(35, 35, 35)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbV)
                            .add(jtfVolume, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(30, 30, 30)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jlbM)
                            .add(jtfMass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 431, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 20, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonAdd)
                    .add(jButtonReset))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNameActionPerformed

    private void jtfMassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMassActionPerformed

    private void jtfNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNSXActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to add product ?", "Question Confirm"
                , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        try{
            String id = jtfID.getText();
            String name = jtfName.getText();
            String nsx = jtfNSX.getText();
            String hsd = jtfHSD.getText();
            Double price = Double.valueOf(jtfPrice.getText());
            Integer sl = Integer.valueOf(jtfQuantity.getText());
            Boolean check = sh.checkInput(new Product(id,name,nsx,hsd,price,sl), sh.getShop());
            
            if(jtfMass.getText().isEmpty()) jtfMass.setText("0");
            else jtfVolume.setText("0");
            Double m = Double.valueOf(jtfMass.getText());
            Double v = Double.valueOf(jtfVolume.getText());

            if(check==true && v>0 && choice==JOptionPane.YES_OPTION){
                sh.getShop().add(new VolumnProduct(id,name,nsx,hsd,price,sl,v));
            }else if(check==true && m>0 && choice==JOptionPane.YES_OPTION){          
                sh.getShop().add(new WeightProduct(id,name,nsx,hsd,price,sl,m));
            }else{
                JOptionPane.showMessageDialog(this, "Invalid input value or Only enter either Volume or Mass!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Invalid input value or Only enter either Volume or Mass!");

        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to reset ?", "Question Confirm"
                , JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(choice == JOptionPane.YES_OPTION){
            this.jtfID.setText("");
            this.jtfName.setText("");
            this.jtfNSX.setText("");
            this.jtfHSD.setText("");
            this.jtfPrice.setText("");
            this.jtfQuantity.setText("");
            this.jtfVolume.setText("");
            this.jtfMass.setText("");
        }
    }//GEN-LAST:event_jButtonResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlbHSD;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbM;
    private javax.swing.JLabel jlbNSX;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbPrice;
    private javax.swing.JLabel jlbQuantity;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JLabel jlbV;
    private javax.swing.JTextField jtfHSD;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfMass;
    private javax.swing.JTextField jtfNSX;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPrice;
    private javax.swing.JTextField jtfQuantity;
    private javax.swing.JTextField jtfVolume;
    // End of variables declaration//GEN-END:variables
}
