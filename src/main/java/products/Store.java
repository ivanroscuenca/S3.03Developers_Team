package products;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store {
    private String nameStore;
    private List<Product> products;
    private static Store store;

    protected Store(String name) {
        this.nameStore=name;
        products=new ArrayList<>();
    }
    /* Making Store singleton */
    public static Store getStore(String name) {
        if(store==null) {
            return new Store(name);
        }
        else {
            store.nameStore=name;
            return store;
        }
    }


    public String Stock() {
        return "Store{" +
                "nameStore='" + nameStore + '\'' +
                ", products=" + products +
                '}';
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
// modified by utils
    public void saveProductsToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (Product product : products) {
                printWriter.println("Product : " + product.getName() + ", Price: " + product.getPrice() + ".");
            }

            printWriter.close();
        } catch (IOException e) {
            System.err.printf("Error writing the file : ", e.getMessage());
        }

    }

    public String getTotalQty() {

        String sentence="";
        for (Product product : products) {

            sentence+= "Product : " + product.getName() + ", Quantity : "+ product.getQuantity()+". ";
        }
        return sentence;
    }



    public double getTotalValue() {
            double totalValue = 0.0;

            for (Product product : products) {
            totalValue += product.getQuantity()* product.getPrice();
            }

            return totalValue;
        }


}





