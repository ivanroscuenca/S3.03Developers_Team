package products;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static Store store;

    static {
        store = Store.getStore("FlowerWorld");
        System.out.println(store.getDecorations().isEmpty());
    }
    public static void menu() {
        boolean continueExecution=true;
        int option;
        while(continueExecution) {
            menuHeader();
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    addTreeMenu();
                    break;
                }
                case 2: {
                    addFlowerMenu();
                    break;
                }
                case 3: {
                    addDecorationMenu();
                    break;
                }
                case 4: {
                    menuTreeRemove();
                    break;
                }
                case 5: {
                    menuFlowerRemove();
                    break;
                }
                case 6: {
                    menuDecorationRemove();
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
                    printingAllSets();
                    break;
                }
                case 9: {
                    break;
                }
                case 10: {
                    break;
                }
                case 11: {
                    break;
                }
                case 12: {
                    break;
                }
                case 0: {
                    continueExecution=false;
                    sc.close();
                }
            }
        }
    }
    public static void menuHeader() {
        System.out.println("Choose and option: ");
        System.out.println("1: Adding tree");
        System.out.println("2: Adding flower");
        System.out.println("3: Adding decoration");
        System.out.println("4: Remove tree");
        System.out.println("5: Remove flower");
        System.out.println("6: Remove decoration");
        System.out.println("7: Printing stock");
        System.out.println("8: Printing stock - full stock");
        System.out.println("9: Printing total stock value");
        System.out.println("10: Generating purchase ticket");
        System.out.println("11: Listing purchase tickets");
        System.out.println("12: Printing purchases incoming");
    }
    public static void addTreeMenu() {
        System.out.println("Type tree name");
        String name=sc.nextLine();
        System.out.println("Type tree price");
        Double price=Double.parseDouble(sc.nextLine());
        System.out.println("Type trees quantity");
        Integer quantity=Integer.parseInt(sc.nextLine());
        System.out.println("Type tree height");
        Double height=Double.parseDouble(sc.nextLine());
        store.addTree(new Tree(name,price,quantity,height));
    }

    public static void addFlowerMenu() {
        System.out.println("Type flower name");
        String name=sc.nextLine();
        System.out.println("Type flower price");
        Double price=Double.parseDouble(sc.nextLine());
        System.out.println("Type flowers quantity");
        Integer quantity=Integer.parseInt(sc.nextLine());
        System.out.println("Type flower colour");
        String colour=sc.nextLine();
        store.addFlower(new Flower(name,price,quantity,colour));
    }

    public static void addDecorationMenu() {
        System.out.println("Type decoration name");
        String name=sc.nextLine();
        System.out.println("Type decoration price");
        Double price=Double.parseDouble(sc.nextLine());
        System.out.println("Type decoration quantity");
        Integer quantity=Integer.parseInt(sc.nextLine());
        System.out.println("Type tree material: wood (W) or plastic (P)");
        String material=sc.nextLine();
        Materials auxMaterial=null;
        if(material.equals("W")) {
            auxMaterial=Materials.WOOD;
        }
        else if(material.equals("P")){
            auxMaterial=Materials.PLASTIC;
        }
        store.addDecoration(new Decoration(name,price,quantity,auxMaterial));
        Utils.fromDecorationSetToFile(store.getDecorations());
    }
    public static void menuTreeRemove() {
        System.out.println("Which tree do you want to remove? Type its name");
        Utils.printingSet(store.getTrees());
        String name=sc.nextLine();
        boolean treeNotFound=true;
        Iterator it = store.getTrees().iterator();
        while(treeNotFound && it.hasNext()) {
            Tree tree = (Tree) it.next();
            if(tree.name.equals(name)) {
                it.remove();
                treeNotFound = false;
            }
        }
        Utils.fromTreeSetToFile(store.getTrees());
    }
    public static void menuFlowerRemove() {
        System.out.println("Which flower do you want to remove? Type its name");
        Utils.printingSet(store.getFlowers());
        String name=sc.nextLine();
        boolean flowerNotFound=true;
        Iterator it = store.getFlowers().iterator();
        while(flowerNotFound && it.hasNext()) {
            Flower flower = (Flower) it.next();
            if(flower.name.equals(name)) {
                it.remove();
                flowerNotFound = false;
            }
        }
        Utils.fromFlowerSetToFile(store.getFlowers());
    }
    public static void menuDecorationRemove() {
        System.out.println("Which decoration do you want to remove? Type its name");
        Utils.printingSet(store.getDecorations());
        String name=sc.nextLine();
        boolean decorationNotFound=true;
        Iterator it = store.getFlowers().iterator();
        while(decorationNotFound && it.hasNext()) {
            Decoration decoration = (Decoration) it.next();
            if(decoration.name.equals(name)) {
                it.remove();
                decorationNotFound = false;
            }
        }
        Utils.fromDecorationSetToFile(store.getDecorations());
    }

    public static void printingAllSets() {
        Utils.printingSet(store.getTrees());
        System.out.println();
        Utils.printingSet(store.getFlowers());
        System.out.println();
        Utils.printingSet(store.getDecorations());
        System.out.println();
    }
}
