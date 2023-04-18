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

    public HashSet<Flower> getFlowers() {
        return flowers;
    }

    public HashSet<Tree> getTrees() {
        return trees;
    }

    public HashSet<Decoration> getDecorations() {
        return decorations;
    }

    public double getStockValue() {
        return stockValue;
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

    public void printStock(){

        flowers.stream().forEach(System.out::print);
        trees.stream().forEach(System.out::print);
        decorations.stream().forEach(System.out::print);
    }

    public void updateTrees(String name, int newQuantity){
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
}





