package products;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private int id;
    private List<Product> products;
    private List<Integer> quantities;

    //constructor
    public Ticket(int id) {
        this.id = id;
        this.products = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void addProduct(Product product, int quantity) {
        this.products.add(product);
        this.quantities.add(quantity);
    }

    public void removeProduct(int index) {
        this.products.remove(index);
        this.quantities.remove(index);
    }

    public double getTotal() {
        double total = 0.0;

        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }


    public void printTicket() {
        System.out.println("***********TOTAL TICKETS*********");
        System.out.println("Ticket ID: " + id);
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Qty products : " + quantities.get(i) + ", Name products : " + products.get(i).getName() + ", Price Product: " + products.get(i).getPrice());
        }
        System.out.println("Total purchase: " + getTotal());
    }

    public static void printTotalTickets(List<Ticket> tickets) {
        double totalPurchase = 0.0;
        for (Ticket t : tickets) {
            totalPurchase += t.getTotal();
        }
        System.out.println("***********TOTAL SALES ALL TICKETS*********");
        System.out.println("TOTAL PURCHASE: " + totalPurchase);
    }




}

