package products;

public final class Decoration extends Product {

    private Materials material;

    private static int numDecoration;

    public Decoration(String name, double price, int quantity, Materials material) {
        super(name, price,quantity);
        this.material=material;
        this.numDecoration+=quantity;
    }

    @Override
    public String toString() {
        return "Decoration : " +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", material=" + material +
                '.';
    }
}
