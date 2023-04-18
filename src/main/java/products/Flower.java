package products;

public class Flower extends Product {

    private static int numFlowers;
    private String colour;
    public Flower(String name, double price, int quantity,String colour) {
        super(name, price, quantity);
        this.numFlowers += quantity;
        this.colour=colour;
    }
}
