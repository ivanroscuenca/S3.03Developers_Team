package products;

public final class Tree extends Product{
    private double height;
    private static int numTrees;
    {
        numTrees++;
    }
    public Tree(String name, double price, int quantity, double height) {
        super(name, price, quantity);
        this.height=height;
    }
    public Tree() {

    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {

        return super.toString()+" | Product height: "+this.height;
    }
}
