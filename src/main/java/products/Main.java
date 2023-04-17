package products;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Decoration> list1=new ArrayList<>();
        list1.add(new Decoration("Jar",12.20, Materials.WOOD));
        list1.add(new Decoration("Vue",16.20, Materials.WOOD));
        Utils.fromSetToFileProduct(list1);
    }
}


