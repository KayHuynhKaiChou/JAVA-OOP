/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorList;
import Model.BookList;
import View.ManagementBook;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        AuthorList aList = new AuthorList();
        new ManagementBook(new BookList(),aList).run();
    }
}
