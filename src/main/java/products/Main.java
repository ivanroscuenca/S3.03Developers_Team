package products;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("flor");

        store.addDecoration(new Decoration("Jar",12.20, Materials.WOOD));
        store.addFlower(new Flower("Rose",10.2, "red"));
        store.addTree(new Tree("Oak",45.5,1.2));
        store.addTree(new Tree("Pine",23.5,1.0));
        store.addTree(new Tree("Alder",32.4,1.0));
        store.addTree(new Tree("Fir",57.5,1.0));
        store.printStock();

/*
        List<Decoration> list1=new ArrayList<>();
        list1.add(new Decoration("Jar",12.20, Materials.WOOD));
        list1.add(new Decoration("Vue",16.20, Materials.WOOD));
        Utils.fromSetToFileProduct(list1);
  */

    }

}


