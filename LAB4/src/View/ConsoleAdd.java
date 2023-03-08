/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import IOTools.IOkeyboard;
import Model.AuthorList;
import Model.Book;
import Model.BookList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ConsoleAdd {
    String[] submenu = {"ISBN","Title","Price","AuthorID"};
    String title = "======Choice of Inputed Book Attribute======";
    
    public void swingAdd(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for(int i=0; i<submenu.length;i++){
            System.out.println((i+1)+"."+submenu[i]);
        }
        System.out.println("--------------------------------");
    }
    
    public int getSelected(){
        while(true){
            try{
                swingAdd();
                Scanner sc= new Scanner(System.in);
                System.out.print("Enter User selection: ");
                return Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.err.println("Option must be Integer, Not another character, Please enter again!");
            }
        }
    }
    
    public Book runFunction(BookList bl, AuthorList al){
        Book b = new Book(); int n =0 ; int count = 0; int check = 0;
        while(true){
            
            n = getSelected();
            if(n!=check){
                switch(n){
                    case 1:
                        while(true){
                            String isbn = IOkeyboard.forcedMatchesRegex("Enter ISBN Book: ", "ISBN is not suitable , ex: 5489321800121,... , pls enter again!", "[0-9]{13}");
                            if(bl.searchByISBN(isbn)!=null){ System.out.println("ISBN is so similar with available ISBN, pls enter again!");}
                            else {b.setIsbn(isbn); submenu[n-1] += (" ("+isbn+")"); break;}
                        }
                        
                        break;
                    case 2:
                        String title = IOkeyboard.forcedMatchesRegex("Enter Title Book: ", "Title just include less than 30 characters , pls enter again!", "[a-zA-Z0-9 ]{1,30}");
                        b.setTitle(title);
                        submenu[n-1] += (" ("+title+")");
                        break;
                    case 3:
                        Double price = IOkeyboard.inputDouble("Enter Price Book: ", "Price is in range [1,1000000] and divisible by 1000 ,pls enter again!", "[1-9][0-9]{0,2}000|1000000");
                        b.setPrice(price);
                        submenu[n-1] += (" ("+price+")");
                        break;
                    case 4:
                        System.out.println("-------------------------------------");
                        al.forEach(System.out::println);
                        System.out.println("-------------------------------------");
                        while(true){
                            String auID = IOkeyboard.forcedMatchesRegex("Enter authorID: ", "authorID is not suitable, ex: A00,A12,..., pls enter again!", "A[0-9][0-9]|A100| ");
                            if(al.searchByAuID(auID)==null) {System.out.println("This authorID not exist in author list, pls enter again!");}
                            else{b.setAuthorID(auID); submenu[n-1] += (" ("+auID+")"); break;}
                        }
                        break;           
                }
                count += n;
            }else System.out.println("You have chosen section "+n+",pls choose anothor section!");
            check = n;
            if(count == 10) break;
        }
        return b;
    }
}
