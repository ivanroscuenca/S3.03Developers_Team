package products;

public final class Decoration extends Product {
    private Materials material;
    private static int numDecoration;
    {
        numDecoration++;
    }
    public Decoration(String name, double price, int quantity, Materials material) {
        super(name, price, quantity);
        this.material=material;
    }

    public Decoration() {

    }
    public Materials getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString()+" | Product type: "+this.material;
    }
}
