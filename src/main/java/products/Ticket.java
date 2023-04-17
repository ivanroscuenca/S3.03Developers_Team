package products;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<Purchase> purchases;

    public Ticket() {
        this.purchases = new ArrayList<>();
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public void removePurchase(Purchase purchase) {
        purchases.remove(purchase);
    }

    public double getTotal() {
        double total = 0.0;

        for (Purchase purchase : purchases) {
            total += purchase.getPrice() * purchase.getQuantity();
        }

        return total;
    }

    public void printTicket(Purchase purchase) {
        System.out.println("***********TICKET*********");
        System.out.println("Qty products : "+ purchase.getQuantity()+", Name product : " + purchase.getProduct().getName()+ ",Price Product: " +purchase.getPrice());
        System.out.println("Total purchase: " +  purchase.getQuantity()*purchase.getPrice());
    }

    public void printTotalTickets() {
        System.out.println("***********TOTAL TICKETS*********");
        for (Purchase purchase : purchases) {
            System.out.println("Qty products : "+ purchase.getQuantity()+", Name products : " + purchase.getProduct().getName()+ ",Price Product: " +purchase.getPrice());
        }
        System.out.println("Total purchase: " +  getTotal());
    }

}
