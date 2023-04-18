package products;

public final class   Flower extends Product {
    private String colour;
    static int numFlowers;

    public Flower(String name, double price, int quantity, String colour) {
        super(name, price, quantity);
        this.colour = colour;
    }


    public Flower() {

    }

    public String getColour() {
        return colour;
    }
}
