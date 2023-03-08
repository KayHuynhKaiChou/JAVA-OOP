
package controller;

import java.util.ArrayList;
import model.CDList;


public class Test {

    public static void main(String[] args) {
        CDList cDList = new CDList(new ArrayList<>());
        CDHouse cDHouse = new CDHouse(cDList);
        cDHouse.run();
    }
}
