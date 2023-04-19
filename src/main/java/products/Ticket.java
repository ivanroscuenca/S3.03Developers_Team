package products;

import java.util.*;


public class Ticket {

        private HashMap<Product, Integer> tickets;

        public Ticket() {

            this.tickets = new HashMap<>();
        }

        public void addProductTicket(Product product, int quantity) {
            tickets.put(product, quantity);
        }

    public void removeProductTicket(String name) {
        for (Iterator<Map.Entry<Product, Integer>> it = tickets.entrySet().iterator(); it.hasNext();) {
            Map.Entry<Product, Integer> entry = it.next();
            Product product = entry.getKey();
            if (product.getName().equals(name)) {
                it.remove();
                break;
            }
        }
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

    public Ticket generateTicket() {
        Scanner scanner = new Scanner(System.in);

        Ticket ticket = new Ticket();

        while (true) {
            System.out.println("Enter product name (or 'none' to finish adding products):");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("none")) {
                break;
            }

            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter price:");
            double price = scanner.nextDouble();
            scanner.nextLine();

            Product product = new Product(name, price, quantity);
            ticket.addProductTicket(product, quantity);
        }

        return ticket;
    }
}


