package products;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Decoration> decors= new HashSet<>();
        decors.add(new Decoration("Jar",19.00,20,Materials.PLASTIC));
        decors.add(new Decoration("Jor",20.00,21,Materials.WOOD));
        Utils.fromDecorationSetToFile(decors);



    }

}


