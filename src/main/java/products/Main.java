package products;

public class Main {
    public static void main(String[] args) {

        //1.Crear Floristeria.
        Store store1 = new Store("Flower Shop");

        //2.Afegir Arbre.
        Product prod1 = new Tree("Oak", 80.0, 10, 2.20);
        store1.addProduct(prod1);

        //3.Afegir Flor.
        Product prod2 = new Flower("Rose", 3.0, 50,"red");
        store1.addProduct(prod2);

        //4.Afegir Decoració.
        Product prod3 = new Decoration("Jar", 10.0, 20,"plastic");
        store1.addProduct(prod3);

        //5.Stock: Imprimeix per pantalla tots els arbres, flors i decoració que té la floristeria.
        System.out.println("Total stock is : "+store1.Stock());

        //6.Retirar arbre.
        //store1.removeProduct(prod1);

        //7.Retirar flor.
        //store1.removeProduct(prod2);

        //8.Retirar decoració.
        //store1.removeProduct(prod3);

        //9.Printar per pantalla stock amb quantitats.
        System.out.println("The total quantities of the stock is : "+ store1.getTotalQty());

        //10.Printar per pantalla valor total de la floristeria.
        System.out.println("The total value of the stock is : "+ store1.getTotalValue());

        //11.Crear tickets de compra amb múltiples objectes.

        Ticket ticket = new Ticket();
        Purchase purchase1 = new Purchase(store1.getProductByName("Rose"), 3);
        Purchase purchase2 = new Purchase(store1.getProductByName("Jar"), 1);
        ticket.addPurchase(purchase1);
        ticket.addPurchase(purchase2);

        //12.Mostrar una llista de compres antigues.
        ticket.printTicket(purchase1);

        //13.Visualitzar el total de diners guanyats amb totes les vendes.
        ticket.printTotalTickets();

        // save the inventory to a file
        store1.saveProductsToFile("inventory.txt");
    }
}


