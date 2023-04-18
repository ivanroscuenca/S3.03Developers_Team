package products;

import java.util.ArrayList;
import java.util.List;

import static products.Ticket.printTotalTickets;

public class Main {
    public static void main(String[] args) {
        //1.Crear Floristeria.
        Store store1 = new Store("Flower Shop");

        //2.Afegir Arbre.
        Product prod1 = new Tree("Oak", 80.0, 10, 2.20);
        store1.addProduct(prod1);

        Product prod2 = new Tree("Pine", 50.0, 5, 1.20);
        store1.addProduct(prod2);

        //3.Afegir Flor.
        Product prod3 = new Flower("Rose", 3.0, 50,"red");
        store1.addProduct(prod3);

        Product prod4 = new Flower("sunflower", 2.0, 100,"yellow");
        store1.addProduct(prod4);

        //4.Afegir Decoració.
        Product prod5 = new Decoration("Jar", 20.0, 20,Materials.PLASTIC);
        store1.addProduct(prod5);

        Product prod6 = new Decoration("paperweight", 10.0, 30,Materials.WOOD);
        store1.addProduct(prod6);


        //5.Stock: Imprimeix per pantalla tots els arbres, flors i decoració que té la floristeria.
        System.out.println("Total stock is : "+store1.Stock());

//        //6.Retirar arbre.
        store1.removeProduct(prod2);
//
//        //7.Retirar flor.
        store1.removeProduct(prod4);
//
//        //8.Retirar decoració.
        store1.removeProduct(prod6);
        System.out.println("Total stock is : "+store1.Stock());

        //9.Printar per pantalla stock amb quantitats.
        System.out.println("The total quantities of the stock is : "+ store1.getTotalQty());

        //10.Printar per pantalla valor total de la floristeria.
        System.out.println("The total value of the stock is : "+ store1.getTotalValue());

        //11.Crear tickets de compra amb múltiples objectes.
        Ticket ticket1 = new Ticket(1);
        ticket1.addProduct(prod1,2);
        ticket1.addProduct(prod2,1);

        Ticket ticket2 = new Ticket(2);
        ticket2.addProduct(prod3,4);

        Ticket ticket3 = new Ticket(3);
        ticket3.addProduct(prod5,1);

        //12.Mostrar una llista de compres antigues.
        ticket1.printTicket();
        ticket2.printTicket();
        ticket3.printTicket();

        //13.Visualitzar el total de diners guanyats amb totes les vendes.

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);

        printTotalTickets(tickets);

        // save the inventory to a file


        List<Decoration> list1=new ArrayList<>();
        list1.add(new Decoration("Jar",12.20,2, Materials.WOOD));
        list1.add(new Decoration("Vue",16.20,4, Materials.WOOD));

       Utils.fromSetToFileProduct(list1);
    }
}


