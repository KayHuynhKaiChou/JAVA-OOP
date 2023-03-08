/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Cart;
import Model.Product;
import Model.ShopProduct;
import Model.VolumnProduct;
import Model.WeightProduct;
import controller.ConvertSwingFunction;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class CartJP extends javax.swing.JPanel {
    private ShopProduct sp;
    private Cart ca;
    private DefaultTableModel dTable;
    
   
    public CartJP() {
        initComponents();
        this.sp = ConvertSwingFunction.shop;
        this.ca = ConvertSwingFunction.ca;
        //this.dTable = (DefaultTableModel) jTable1.getModel();
        this.showCarttoTable();
    }

    public ShopProduct getSp() {
        return sp;
    }

    public Cart getCa() {
        return ca;
    }

    public void showCarttoTable(){ 
        dTable = new DefaultTableModel(sp.getData(ca.getBasket()),new Product().getTitle()){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column==8;           
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if(columnIndex==8) return Boolean.class;
                else return String.class;
            }
            
        };        
        jTableCart.setModel(dTable);
        /*for (Product sp : ca.getBasket()) {
            if(sp instanceof VolumnProduct){
                dTable.addRow(new Object[]{sp.getId(),sp.getProductName(),sp.getNSX(),
                sp.getHSD(),sp.getPrice(),sp.getQuantity(),((VolumnProduct) sp).getVolumn(),0,new Boolean(false)});
            }else{
                dTable.addRow(new Object[]{sp.getId(),sp.getProductName(),sp.getNSX(),
                sp.getHSD(),sp.getPrice(),sp.getQuantity(),0,((WeightProduct) sp).getWeight(),new Boolean(false)});
            }
        }*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRemove = new javax.swing.JButton();
        jlbTitle = new javax.swing.JLabel();
        jScrollPaneCart = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 204));

        jButtonRemove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jlbTitle.setBackground(new java.awt.Color(255, 255, 102));
        jlbTitle.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setText("CART");
        jlbTitle.setOpaque(true);

        jTableCart.setBackground(new java.awt.Color(153, 255, 255));
        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "NSX", "HSD", "Price", "Quantity", "V(ml)", "M(g)", "Buy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneCart.setViewportView(jTableCart);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPaneCart))
                    .add(layout.createSequentialGroup()
                        .add(316, 316, 316)
                        .add(jlbTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 323, Short.MAX_VALUE)))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(368, 368, 368)
                .add(jButtonRemove, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 148, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jlbTitle, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPaneCart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 305, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButtonRemove, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        ArrayList<Product> spSelected = new ArrayList<>();
        for (int i=0; i<dTable.getRowCount();i++) {
            if(dTable.getValueAt(i, 8).equals(Boolean.TRUE)){ 
                Product p = ca.getProductFromBasket(dTable.getValueAt(i, 0)+"");
                spSelected.add(p);
               
                //check = true;
                //dTabel.setRowCount(0);
                //this.showTable();
                //dTabel.setValueAt(Boolean.FALSE, i, 8);
                
                //dTabel.setValueAt(sp.getShop().get(i).getQuantity(), i, 5);
            } 
        }
        for (Product p : spSelected) {
            ca.removeItem(p, sp);
        }
        dTable.setRowCount(0);
        this.showCarttoTable();
        //if(check == false) JOptionPane.showMessageDialog(this, "ID not exist");
    }//GEN-LAST:event_jButtonRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JScrollPane jScrollPaneCart;
    private javax.swing.JTable jTableCart;
    private javax.swing.JLabel jlbTitle;
    // End of variables declaration//GEN-END:variables
}
