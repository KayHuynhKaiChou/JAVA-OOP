
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


public class CDList extends ArrayList<CD> implements Serializable{

    public CDList() {
    }

    public CDList(Collection<? extends CD> c) {
        super(c);
    }

    public CDList search(String searchWord) {
        return new CDList(this.stream()
                .filter(p -> p.getTitle().toLowerCase().contains(searchWord.toLowerCase()))
                .collect(Collectors.toList()));
    }

    public void showList() {
        this.forEach(System.out::println);
    }

    public boolean spaceCheck(int n) {
        return this.size() < n;
    }
}
