package products;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("flor");

        store.addDecoration(new Decoration("Jar",12.20, Materials.WOOD));
;
        store.addTree(new Tree("Oak",45.5,2,1.2));


        store.printStock();

/*
        List<Decoration> list1=new ArrayList<>();
        list1.add(new Decoration("Jar",12.20, Materials.WOOD));
        list1.add(new Decoration("Vue",16.20, Materials.WOOD));
        Utils.fromSetToFileProduct(list1);

        Set<Decoration> list1=new HashSet<>();
        list1.add(new Decoration("Jar",12.20, 12, Materials.WOOD));
        list1.add(new Decoration("Vue",16.20, 25, Materials.WOOD));
        Utils.fromDecorationSetToFile(list1);
        Set<Decoration> dec = Utils.fromFileProductToDecorationSet();
        for(Decoration decoration:dec) {
            System.out.println(decoration);
        }
 */
    }

}


