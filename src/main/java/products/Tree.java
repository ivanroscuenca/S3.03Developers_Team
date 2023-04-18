package products;

public final class Tree extends Product{

    private double height;
    private static int numTrees;

    public Tree(String name, double price,int quantity,double height) {
        super(name, price,quantity);
        this.height=height;
        this.numTrees += numTrees;
    }

    @Override
    public String toString() {

        return " | "+super.toString()+" | Product height: "+this.height;
    }
}
