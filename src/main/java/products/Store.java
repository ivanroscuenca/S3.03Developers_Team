package products;

import java.io.*;
import java.util.*;

public class Store {

    private String nameStore;
    private static Store store;

    private HashSet<Flower> flowers;
    private HashSet<Tree> trees;
    private HashSet<Decoration> decorations;

    private double stockValue;

    Store(String name) {
        this.nameStore=name;

        flowers = new HashSet<Flower>();
        trees = new HashSet<Tree>();
        decorations = new HashSet<Decoration>();
    }


    /* Making Store singleton */
    public static Store getStore(String name) {
        if(store==null) {
            return new Store(name);
        }
        else {
            store.nameStore=name;
            return store;
        }
    }

    public String Stock() {
        return "Store{" +
                "nameStore='" + nameStore + '\'' +
                ", products=" + flowers + trees + decorations +
                '}';
    }

    public void addFlower(Flower flower) { flowers.add(flower);}

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    public void addDecoration(Decoration decoration) {
        decorations.add(decoration);
    }

    public void removeFlower(Flower flower) {
        flowers.remove(flower);
    }

    public void removeTree(Tree tree) {
        trees.remove(tree);
    }

    public void removeDecoration(Decoration decoration) {
        decorations.remove(decoration);
    }


    public void printStock(){

        flowers.stream().forEach(System.out::print);
        trees.stream().forEach(System.out::print);
        decorations.stream().forEach(System.out::print);


        /*for (Flower flower: flowers   ) {
            System.out.println(flower);
        }

        for (Tree tree:trees   ) {
            System.out.println(tree);
        }

        for (Decoration decoration: decorations   ) {
            System.out.println(decoration);
        }*/

    }

    @Override
    public String toString() {
        return "Store{" +
                "nameStore='" + nameStore + '\'' +
                ", flowers=" + flowers +
                ", trees=" + trees +
                ", decorations=" + decorations +
                ", stockValue=" + stockValue +
                '}';
    }

    public static void updateTrees(String name, int newQuantity){
        boolean treeNotFound=true;
        Iterator it = this.trees.iterator();
        while(treeNotFound && it.hasNext()) {
            Tree tree = (Tree) it.next();
            if(tree.name.equals(name)) {
                tree.quantity=newQuantity;
                treeNotFound = false;
            }
        }
    }

    public void updateFlowers (String name, int newQuantity){
        boolean flowerNotFound=true;
        Iterator it = this.flowers.iterator();
        while(flowerNotFound && it.hasNext()) {
            Flower flower = (Flower) it.next();
            if(flower.name.equals(name)) {
                flower.quantity=newQuantity;
                flowerNotFound = false;
            }
        }
    }

    public void updateDecors (String name, int newQuantity){
        boolean decorNotFound=true;
        Iterator it = this.decorations.iterator();
        while(decorNotFound && it.hasNext()) {
            Decoration decoration = (Decoration) it.next();
            if(decoration.name.equals(name)) {
                decoration.quantity=newQuantity;
                decorNotFound = false;
            }
        }
    }


/*


    public void saveProductsToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (Product product : products) {
                printWriter.println("Product : " + product.getName() + ", Price: " + product.getPrice() + ".");
            }

            printWriter.close();
        } catch (IOException e) {
            System.err.printf("Error writing the file : ", e.getMessage());
        }

    }

    public String getTotalQty() {

        String sentence="";
        for (Product product : products) {

            sentence+= "Product : " + product.getName() + ", Quantity : "+".";
        }
        return sentence;
    }



    public double getTotalValue() {
            double totalValue = 0.0;

            for (Product product : products) {

            }

            return totalValue;
        }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

 */

}





