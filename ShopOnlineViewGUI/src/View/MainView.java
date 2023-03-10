/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import java.util.ArrayList;
import java.util.List;
import View.FunctionJP;
import controller.ConvertSwingFunction;
import controller.FirstView;
import javax.swing.ImageIcon;

/**
 *
 * @author DELL
 */
public class MainView extends javax.swing.JFrame {
    
    public MainView() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Manage Shop");
        //icon = new ImageIcon("Iconshop.png");
        this.setIconImage(FirstView.icon.getImage());
        ConvertSwingFunction controller = new ConvertSwingFunction(jpnView);        
        controller.setView();
        
        List<FunctionJP> listItem = new ArrayList<>();
        listItem.add(new FunctionJP("Shop",jpnShop, jlbShop));
        listItem.add(new FunctionJP("Cart",jpnCart, jlbCart));
        listItem.add(new FunctionJP("Add new product",jpnNewProduct, jlbNewProduct));
        listItem.add(new FunctionJP("Search product",jpnSearch, jlbSearch));
        listItem.add(new FunctionJP("Print Order",jpnPrint, jlbPrint));        
        listItem.add(new FunctionJP("Exit",jpnExit, jlbExit));
        
        controller.setEvent(listItem);
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
        jPanel2 = new javax.swing.JPanel();
        jpnFunctionShop = new javax.swing.JPanel();
        jlbFS = new javax.swing.JLabel();
        jpnShop = new javax.swing.JPanel();
        jlbShop = new javax.swing.JLabel();
        jpnCart = new javax.swing.JPanel();
        jlbCart = new javax.swing.JLabel();
        jpnNewProduct = new javax.swing.JPanel();
        jlbNewProduct = new javax.swing.JLabel();
        jpnSearch = new javax.swing.JPanel();
        jlbSearch = new javax.swing.JLabel();
        jpnPrint = new javax.swing.JPanel();
        jlbPrint = new javax.swing.JLabel();
        jpnExit = new javax.swing.JPanel();
        jlbExit = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Function Shopping Online");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jpnFunctionShop.setBackground(new java.awt.Color(255, 0, 0));

        jlbFS.setBackground(new java.awt.Color(255, 0, 0));
        jlbFS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbFS.setForeground(new java.awt.Color(255, 255, 255));
        jlbFS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbFS.setText("Function Shopping ");
        jlbFS.setOpaque(true);

        org.jdesktop.layout.GroupLayout jpnFunctionShopLayout = new org.jdesktop.layout.GroupLayout(jpnFunctionShop);
        jpnFunctionShop.setLayout(jpnFunctionShopLayout);
        jpnFunctionShopLayout.setHorizontalGroup(
            jpnFunctionShopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnFunctionShopLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbFS, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnFunctionShopLayout.setVerticalGroup(
            jpnFunctionShopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnFunctionShopLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbFS, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnShop.setBackground(new java.awt.Color(51, 255, 51));
        jpnShop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlbShop.setBackground(new java.awt.Color(255, 255, 255));
        jlbShop.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbShop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbShop.setText("Shop");

        org.jdesktop.layout.GroupLayout jpnShopLayout = new org.jdesktop.layout.GroupLayout(jpnShop);
        jpnShop.setLayout(jpnShopLayout);
        jpnShopLayout.setHorizontalGroup(
            jpnShopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnShopLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbShop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnShopLayout.setVerticalGroup(
            jpnShopLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnShopLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbShop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnCart.setBackground(new java.awt.Color(51, 255, 51));
        jpnCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlbCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbCart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbCart.setText("Cart");

        org.jdesktop.layout.GroupLayout jpnCartLayout = new org.jdesktop.layout.GroupLayout(jpnCart);
        jpnCart.setLayout(jpnCartLayout);
        jpnCartLayout.setHorizontalGroup(
            jpnCartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnCartLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbCart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnCartLayout.setVerticalGroup(
            jpnCartLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnCartLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbCart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnNewProduct.setBackground(new java.awt.Color(51, 255, 51));
        jpnNewProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlbNewProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbNewProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNewProduct.setText("Add new product");

        org.jdesktop.layout.GroupLayout jpnNewProductLayout = new org.jdesktop.layout.GroupLayout(jpnNewProduct);
        jpnNewProduct.setLayout(jpnNewProductLayout);
        jpnNewProductLayout.setHorizontalGroup(
            jpnNewProductLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnNewProductLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbNewProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNewProductLayout.setVerticalGroup(
            jpnNewProductLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnNewProductLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbNewProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnSearch.setBackground(new java.awt.Color(51, 255, 51));
        jpnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlbSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSearch.setText("Search product");

        org.jdesktop.layout.GroupLayout jpnSearchLayout = new org.jdesktop.layout.GroupLayout(jpnSearch);
        jpnSearch.setLayout(jpnSearchLayout);
        jpnSearchLayout.setHorizontalGroup(
            jpnSearchLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnSearchLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbSearch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnSearchLayout.setVerticalGroup(
            jpnSearchLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnSearchLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbSearch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnPrint.setBackground(new java.awt.Color(0, 255, 51));
        jpnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlbPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbPrint.setText("Print Order");

        org.jdesktop.layout.GroupLayout jpnPrintLayout = new org.jdesktop.layout.GroupLayout(jpnPrint);
        jpnPrint.setLayout(jpnPrintLayout);
        jpnPrintLayout.setHorizontalGroup(
            jpnPrintLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnPrintLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbPrint, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPrintLayout.setVerticalGroup(
            jpnPrintLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnPrintLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbPrint, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnExit.setBackground(new java.awt.Color(0, 255, 51));

        jlbExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbExit.setText("Exit");

        org.jdesktop.layout.GroupLayout jpnExitLayout = new org.jdesktop.layout.GroupLayout(jpnExit);
        jpnExit.setLayout(jpnExitLayout);
        jpnExitLayout.setHorizontalGroup(
            jpnExitLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnExitLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnExitLayout.setVerticalGroup(
            jpnExitLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnExitLayout.createSequentialGroup()
                .addContainerGap()
                .add(jlbExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpnFunctionShop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpnShop, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpnCart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpnNewProduct, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpnSearch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpnPrint, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jpnExit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpnFunctionShop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpnShop, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpnCart, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpnNewProduct, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpnSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpnPrint, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpnExit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        org.jdesktop.layout.GroupLayout jpnViewLayout = new org.jdesktop.layout.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 969, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jpnView, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jpnView, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ConvertSwingFunction.shop.saveShop("shopp.txt");
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbCart;
    private javax.swing.JLabel jlbExit;
    private javax.swing.JLabel jlbFS;
    private javax.swing.JLabel jlbNewProduct;
    private javax.swing.JLabel jlbPrint;
    private javax.swing.JLabel jlbSearch;
    private javax.swing.JLabel jlbShop;
    private javax.swing.JPanel jpnCart;
    private javax.swing.JPanel jpnExit;
    private javax.swing.JPanel jpnFunctionShop;
    private javax.swing.JPanel jpnNewProduct;
    private javax.swing.JPanel jpnPrint;
    private javax.swing.JPanel jpnSearch;
    private javax.swing.JPanel jpnShop;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
