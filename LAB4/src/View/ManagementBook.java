/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import IOTools.IOkeyboard;
import Model.*;
import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class ManagementBook extends Menu<String> implements FunctionSystem{
    static String[] menu = {"Show the book list","Add a new book","Update a book",
        "Delete a book","Search for a book","Store data to file","Exit"};
    private BookList bookList;
    private AuthorList tgList;

    public ManagementBook(BookList bl, AuthorList al) {
        super("<<============Function System============>>",menu);
        try {
            this.bookList = (BookList) FileService.readFile("book.dat");
            this.tgList = (AuthorList) FileService.readFile("author.dat");
            //this.tgList = al;
        } catch (Exception e) {
            //e.printStackTrace();
            this.bookList = bl;
            this.tgList = al;
        }
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1: showBookList(); break;
            case 2: addNewBook(); storeData(); break;
            case 3: updateBook(); storeData(); break;
            case 4: deleteBook(); storeData(); break;
            case 5: searchBook(); storeData(); break;
            case 6: storeData(); break;
            case 7: deleteAuthor(); break;
            case 8: System.exit(0);
        }
    }

    @Override
    public void showBookList() {
        bookList.printList();
        tgList.forEach(System.out::println);
    }

    @Override
    public void addNewBook() {
        bookList.add(new ConsoleAdd().runFunction(bookList, tgList));
    }

    @Override
    public void updateBook() {
        while(true){
            String isbn = IOkeyboard.forcedMatchesRegex("Enter Book ISBN: ", "ISBN is not suitable , ex: 548932180,... , pls enter again!", "[0-9]{13}");
            Book b = bookList.searchByISBN(isbn);
            if(b==null) {System.out.println("ISBN not exist in book list, pls enter again!");}
            else {
               b.setTitle(IOkeyboard.forcedMatchesRegex("Enter new Book Title: ", "Title just includes less than 30 characters , pls enter again!", "[a-zA-Z0-9 "
                       + "]{1,30}"));
               b.setPrice(IOkeyboard.inputDouble("Enter new price: ", "Price is in range [1,1000000] and divisible by 1000 ,pls enter again!", "[1-9][0-9]{0,2}000|1000000|"
                       + ""));
               System.out.println("-------------------------------------");
               tgList.forEach(System.out::println);
               System.out.println("-------------------------------------");
               while(true){
                    String auID = IOkeyboard.forcedMatchesRegex("Enter authorID: ", "authorID is not suitable, pls enter again!", "A[0-9][0-9]|A100|"
                            + "");
                    if(!auID.isEmpty() && tgList.searchByAuID(auID)==null) System.out.println("This authorID not exist in author list, pls enter again!");
                    else{b.setAuthorID(auID);  break;}
               }
               break;
            }
        }
    }

    @Override
    public void deleteBook() {
        while(true){
            String isbn = IOkeyboard.forcedMatchesRegex("Enter Book ISBN: ", "ISBN is not suitable , ex: 548932180,... , pls enter again!", "[0-9]{13}");
            Book b = bookList.searchByISBN(isbn);
            if(b==null) {System.out.println("ISBN not exist in book list, pls enter again!");}
            else {
               bookList.remove(b);
            }
        }
    }

    @Override
    public void searchBook() {
        new Menu<String>("=========Two Ways to search=========",new String[]{"Search by book name","Search by author name"}){
            @Override
            public void execute(int n) {
                switch(n){
                    case 1: 
                        bookList.searchByBookName(IOkeyboard.inputString("Enter any text: ")).printList();
                        break;
                    case 2:
                        tgList.searchByAuthorName(IOkeyboard.inputString("Enter any text: "), bookList);
                        break;
                }
            }            
        }.run();
        
    }

    @Override
    public void storeData() {
        try {
            FileService.writeFile(bookList,"book.dat");
            System.out.println("Have updated information to system!");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Fail!");
        }
    }

    @Override
    public void deleteAuthor() {
        while(true){
           String auID = IOkeyboard.forcedMatchesRegex("Enter authorID: ", "authorID is not suitable, pls enter again!", "A[0-9][0-9]|A100| ");
           Author au = tgList.searchByAuID(auID);
           if(au==null) {System.out.println("This authorID not exist in author list, pls enter again!");}
           else{
                if(bookList.stream().filter(b -> b.getAuthorID().equals(auID)).findAny().orElse(null)==null){
                    tgList.remove(au); System.out.println("remove successfully! "); return;
                }else {
                    System.out.println("This author has a book in the store, you cannot delete this author , pls enter another author!");
                }
           }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if(in.matches("[0-9]{1,3}|"
                + "")) System.out.println("Yes");
        else System.out.println("No");
    }
    
}
