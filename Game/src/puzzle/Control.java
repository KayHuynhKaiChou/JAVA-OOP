///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package puzzle;
//
//
//import java.awt.Dimension;
//import java.awt.GridLayout;
//import java.awt.Point;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//import javax.swing.JButton;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author DELL
// */
//public class Control {
//    private PuzzleView gui;
//    private int size = 0;
//    private JButton[][] matrix;
//    
//    public Control(PuzzleView gui) {
//        this.gui = gui;
//        this.addButton();
//        gui.pack();
//    }
//    
//    
//    
//    public void addButton(){
//        size = this.gui.jComboBox1.getSelectedIndex()+3;
//        this.gui.jPanel2.setLayout(new GridLayout(size,size,10,10));
//        
//        gui.jPanel2.setPreferredSize(new Dimension(10*size,10*size));
//        matrix = new JButton[size][size];
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                JButton bu = new JButton(i*3+j+1+"");
//                matrix[i][j] = bu;
//                this.gui.jPanel2.add(bu);
//                bu.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        if(checkMove(bu)){
//                            moveButton(bu);
//                            if(checkWin()){
//                                JOptionPane.showMessageDialog(gui, "You Win!");
//                            }
//                        }
//                    }
//                });
//            }
//        }
//        gui.pack();
//        matrix[size-1][size-1].setText("");
//        mixButton();
//    }
//    
//    public Point getPosition(){
//        for(int i=0; i<size; i++){
//            for(int j =0; j< size; j++){
//                if(matrix[i][j].getText().equals("")) return new Point(i, j);
//            }
//        }
//        return null;
//    }
//    
//    public void mixButton(){
//        for(int k=0; k<1000; k++){
//            Point p = getPosition();
//            int i= p.x;
//            int j= p.y;
//            
//            Random ra = new Random();
//            int choice = ra.nextInt(4);
//            
//            switch(choice){
//                case 0: //up
//                    if(i>0){
//                       String tempt = matrix[i-1][j].getText();
//                       matrix[i][j].setText(tempt);
//                       matrix[i-1][j].setText("");
//                    }
//                    break;
//                case 1: //down
//                    if(i<size -1){
//                       String tempt = matrix[i+1][j].getText();
//                       matrix[i][j].setText(tempt);
//                       matrix[i+1][j].setText("");
//                    }
//                    break;
//                case 2: // left
//                    if(j>0){
//                        String tempt = matrix[i][j-1].getText();
//                        matrix[i][j].setText(tempt);
//                        matrix[i][j-1].setText("");
//                    }
//                    break;
//                case 3:
//                    if(j<size -1 ){
//                        String tempt = matrix[i][j+1].getText();
//                        matrix[i][j].setText(tempt);
//                        matrix[i][j+1].setText("");
//                    }
//                    break;
//            }
//        }
//    }
//    
//    public boolean checkMove(JButton b){
//        Point p = getPosition(); int i1=0,j1=0;
//        // dùng loop duyệt để lấy tọa độ của b theo index matrix bởi vì index của p cx theo matrix
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if(matrix[i][j].getText().equals(b.getText())){
//                    i1 = i; 
//                    j1 = j;
//                    break;
//                }
//            }
//        }
//        
//        if(p.x == i1 && Math.abs(p.y - j1) == 1) return true;
//        if(p.y == j1 && Math.abs(p.x - i1)==1) return true;
//        return false;
//    }
//    
//    public void moveButton(JButton b){
//        Point p = getPosition();
//        String tempt = b.getText();
//        matrix[p.x][p.y].setText(tempt);
//        b.setText("");
//    }
//    
//    public boolean checkWin(){
//        if(matrix[size-1][size-1].getText().equals("")){
//            for (int i = 0; i < size; i++) {
//                for (int j = 0; j < size; j++) {
//                    if(i == size -1 && j == size -1) return true;
//                    if(!matrix[i][j].getText().equals(i*3 + j + 1 + "")) return false;
//                }
//            }
//            return true;
//        }
//        return false;
//    }
//}
