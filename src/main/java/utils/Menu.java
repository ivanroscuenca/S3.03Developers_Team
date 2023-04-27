package utils;
import products.Materials;
import store.Store;
import store.*;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

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
                    removeTreeMenu();
                    break;
                }
                case 5: {
                    removeFlowerMenu();
                    break;
                }
                case 6: {
                    removeDecorationMenu();
                    break;
                }
                case 7: {
                    Store.getStore().printingBriefStock();
                    break;
                }
                case 8: {
                    Store.getStore().printingFullStock();
                    break;
                }
                case 9: {
                    Store.getStore().printingStockValue();
                    break;
                }
                case 10: {
                    Ticket ticket = new Ticket();
                    ticket.generateTicket(sc);
                    System.out.println(ticket);
                    break;
                }
                case 11: {
                    Store.store.printTickets();
                    break;
                }
                case 12: {
                    Store.getStore().printingPurchasesValue();
                    break;
                }
                case 0: {
                    continueExecution=false;
                    terminateProgram();
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
        System.out.println("7: Printing stock - brief");
        System.out.println("8: Printing stock - detailed");
        System.out.println("9: Printing total stock value");
        System.out.println("10: Generating purchase ticket");
        System.out.println("11: Listing purchase tickets");
        System.out.println("12: Printing purchases incoming");
        System.out.println("0: Program terminating");
    }

    public static void addTreeMenu() {
        System.out.println("Type tree name");
        String name = Menu.sc.nextLine();
        System.out.println("Type tree price");
        double price = Double.parseDouble(Menu.sc.nextLine());
        System.out.println("Type trees quantity");
        int quantity = Integer.parseInt(Menu.sc.nextLine());
        System.out.println("Type tree height");
        double height = Double.parseDouble(Menu.sc.nextLine());
        Store.getStore().addTree(name, price, quantity, height);
    }

    public static void addFlowerMenu() {
        System.out.println("Type flower name");
        String name= Menu.sc.nextLine();
        System.out.println("Type flower price");
        double price=Double.parseDouble(Menu.sc.nextLine());
        System.out.println("Type flowers quantity");
        int quantity=Integer.parseInt(Menu.sc.nextLine());
        System.out.println("Type flower colour");
        String colour= Menu.sc.nextLine();
        Store.getStore().addFlower(name, price, quantity, colour);
    }

    public static void addDecorationMenu() {
        System.out.println("Type decoration name");
        String name= Menu.sc.nextLine();
        System.out.println("Type decoration price");
        double price=Double.parseDouble(Menu.sc.nextLine());
        System.out.println("Type decoration quantity");
        int quantity=Integer.parseInt(Menu.sc.nextLine());
        System.out.println("Type tree material: wood (W) or plastic (P)");
        String material= Menu.sc.nextLine();
        Materials auxMaterial=null;
        if(material.equals("W")) {
            auxMaterial=Materials.WOOD;
        }
        else if(material.equals("P")){
            auxMaterial=Materials.PLASTIC;
        }
        Store.getStore().addDecoration(name, price, quantity, auxMaterial);
    }

    public static void removeTreeMenu() {
        System.out.println("Which tree do you want to remove? Type its id");
        Utils.printingSet(Store.getStore().getTrees());
        int id= Integer.parseInt(Menu.sc.nextLine());
        Store.getStore().removeTree(id);
    }

    public static void removeFlowerMenu() {
        System.out.println("Which flower do you want to remove? Type its id");
        Utils.printingSet(Store.getStore().getFlowers());
        int id= Integer.parseInt(Menu.sc.nextLine());
        Store.getStore().removeFlower(id);
    }

    public static void removeDecorationMenu() {
        System.out.println("Which decoration do you want to remove? Type its id");
        Utils.printingSet(Store.getStore().getDecorations());
        int id= Integer.parseInt(Menu.sc.nextLine());
        Store.getStore().removeDecoration(id);
    }
    public static void terminateProgram() {
        Utils.updatingFiles(Store.store);
        sc.close();
    }
}
