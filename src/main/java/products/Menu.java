package products;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Store store = new Store("FlowerWorld");
        Scanner sc = new Scanner(System.in);
        boolean continueExecution=true;
        int option;
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

        while(continueExecution) {
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1: {
                    System.out.println("Type tree name");
                    String name=sc.nextLine();
                    System.out.println("Type tree price");
                    Double price=Double.parseDouble(sc.nextLine());
                    System.out.println("Type trees quantity");
                    Integer quantity=Integer.parseInt(sc.nextLine());
                    System.out.println("Type tree height");
                    Double height=Double.parseDouble(sc.nextLine());
                    store.addTree(new Tree(name,price,quantity,height));
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    break;
                }
                case 7: {
                    break;
                }
                case 8: {
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
}
