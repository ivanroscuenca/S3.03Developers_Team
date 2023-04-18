package products;

import java.util.*;


public abstract class Ticket {
        private int id;
        private HashMap<Product, Integer> tickets;

        public Ticket(int id) {
            this.id = id;
            this.tickets = new HashMap<>();
        }

        public void addProductTicket(Product product, int quantity) {
            tickets.put(product, quantity);
        }

    public void removeProductTicket(int id) {

       tickets.remove(id);
    }

        public double getTotal() {
            double total = 0.0;
            for (Map.Entry<Product, Integer> entry : tickets.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                total += product.getPrice() * quantity;
            }
            return total;
        }


    public void printTicket() {
        System.out.println("***********TOTAL TICKETS*********");
        System.out.println("Ticket ID: " + id);
        for (Map.Entry<Product, Integer> entry : tickets.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product.getName() + " X " + quantity + " " + product.getPrice() + "€ each");
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

    //new ticket

//    public Ticket generateTicket(Scanner sc){
//        System.out.println("Type your product");
//        String nameproduct=sc.nextLine();
//
//        System.out.println("Type quantity of your product");
//        Integer quantity=Integer.parseInt(sc.nextLine());
//
//
//
//    }




}

