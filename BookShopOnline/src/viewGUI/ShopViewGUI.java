/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package viewGUI;

import Controller.JCD;
import Model.Book;
import Model.Cart;
import Model.ShopBook;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DELL
 */
public class ShopViewGUI extends javax.swing.JPanel {
    private ShopBook sb;
    private Cart car;
    private DefaultTableModel dTable;
    
    public ShopViewGUI() {
        sb = mainAPP.shB;
        car = mainAPP.ca;
        initComponents();
        this.showTable(sb.getShopSach());
    }

    public ShopBook getSb() {
        return sb;
    }

    public Cart getCar() {
        return car;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShop = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLbImage = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLbBarcode = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLbName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLbAuthor = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLbGenre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLbNumber = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLbQuantity = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLbPrice = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBoxPrice = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Shop Book");
        jPanel1.add(jLabel2);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jTableShop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableShop);

        jPanel3.add(jScrollPane1);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jLbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageBook/HarryChiecCoc.jpg"))); // NOI18N
        jLbImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 180, 1, 270, new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLbImage);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jPanel6.setLayout(new java.awt.GridLayout(7, 2));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Barcode");
        jPanel6.add(jLabel9);

        jLbBarcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbBarcode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbBarcode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbBarcode);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name Book");
        jPanel6.add(jLabel3);

        jLbName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbName);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Author");
        jPanel6.add(jLabel5);

        jLbAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbAuthor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbAuthor);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Genre");
        jPanel6.add(jLabel10);

        jLbGenre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbGenre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbGenre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbGenre);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("number Page");
        jPanel6.add(jLabel8);

        jLbNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbNumber);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Quantity");
        jPanel6.add(jLabel12);

        jLbQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbQuantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbQuantity);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Price");
        jPanel6.add(jLabel14);

        jLbPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLbPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPrice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 15, 1, 1));
        jPanel6.add(jLbPrice);

        jPanel5.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        jComboBoxPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBoxPrice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Shop", "Less than 100.000đ", "from 100.000đ to 300.000đ", "from 300.000đ to 500.000đ", "greater than 500.000đ" }));
        jPanel8.add(jComboBoxPrice);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(jPanel7);

        jPanel4.add(jPanel5);

        jPanel3.add(jPanel4);

        add(jPanel3, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Book> bookSelected = new ArrayList<>();
        int check = 1; Book b = null;
        for(int i=0; i< dTable.getRowCount() ;i++){
            b = sb.getShopSach().get(i);
            if(dTable.getValueAt(i, 7).equals(Boolean.TRUE) && b.getQuantity()!=0)
                bookSelected.add(b);
            else if(b.getQuantity()==0) check = 0;
        }
        if(check==0) JOptionPane.showMessageDialog(this, b.getNameBook()+" has sold out , you cannot buy it !");
        
        int k=0;
        for (Book bo : bookSelected) {
            sb.buyBook(bo, car);
            dTable.setValueAt(Boolean.FALSE, k++, 7);
            new JCD().updateBook(bo);
        }
        dTable.setRowCount(0);
        this.showTable(sb.getShopSach());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShopMouseClicked
        int index = jTableShop.getSelectedRow();
        TableModel model = jTableShop.getModel();
        String pathImage = sb.getShopSach().get(index).getPathimage();
        this.jLbImage.setIcon(this.ResizeImage(pathImage));
        
        this.jLbBarcode.setText(sb.getShopSach().get(index).getBarcode());
        this.jLbName.setText(sb.getShopSach().get(index).getNameBook());
        this.jLbAuthor.setText(sb.getShopSach().get(index).getAuthor());
        this.jLbGenre.setText(sb.getShopSach().get(index).getGenre());
        this.jLbNumber.setText(sb.getShopSach().get(index).getNumberPage()+"");
        this.jLbQuantity.setText(sb.getShopSach().get(index).getQuantity()+"");
        this.jLbPrice.setText(sb.getShopSach().get(index).getPrice()+"");
    }//GEN-LAST:event_jTableShopMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = jComboBoxPrice.getSelectedIndex();
        switch(index){
            case 0:
                this.showTable(sb.getShopSach());
                break;
            case 1:
                dTable.setRowCount(0);
                ArrayList<Book> newshp0 = sb.searchBookbyPrice(sb.getShopSach(), b -> b.getPrice()<100000);
                this.showTable(newshp0);
                break;
            case 2:
                dTable.setRowCount(0);
                ArrayList<Book> newshp1 = sb.searchBookbyPrice(sb.getShopSach(), b -> b.getPrice()>=100000 && b.getPrice()<300000);
                this.showTable(newshp1);
                break;
            case 3:
                dTable.setRowCount(0);
                ArrayList<Book> newshp2 = sb.searchBookbyPrice(sb.getShopSach(), b -> b.getPrice()>=300000 && b.getPrice()<=500000);
                this.showTable(newshp2);
                break;
            case 4:
                dTable.setRowCount(0);
                ArrayList<Book> newshp3 = sb.searchBookbyPrice(sb.getShopSach(), b -> b.getPrice()>500000);
                this.showTable(newshp3);
                break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void showTable(ArrayList<Book> shp){
        dTable = new DefaultTableModel(sb.getData(shp),new Book().getTitle("Buy")){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column==7;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if(columnIndex==7) return Boolean.class; 
                else return String.class;
            }
            
        };
        jTableShop.setModel(dTable);
    }

    public ImageIcon ResizeImage(String PathImage){
        ImageIcon myImage = new ImageIcon(PathImage);
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(this.jLbImage.getWidth()-450,this.jLbImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newmyimage = new ImageIcon(newImg);
        return newmyimage;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxPrice;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbAuthor;
    private javax.swing.JLabel jLbBarcode;
    private javax.swing.JLabel jLbGenre;
    private javax.swing.JLabel jLbImage;
    private javax.swing.JLabel jLbName;
    private javax.swing.JLabel jLbNumber;
    private javax.swing.JLabel jLbPrice;
    private javax.swing.JLabel jLbQuantity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableShop;
    // End of variables declaration//GEN-END:variables
}
