package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private String nameStore;
    private List<Product> products;



    // double stock value



    public Store(String nameStore) {
        this.nameStore = nameStore;
        this.products = new ArrayList<>();
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

    public void saveProductsToFile(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (Product product : products) {
                printWriter.println("Product : " + product.getName() + ", Price: " + product.getPrice() + ", Quantity : " + product.getQuantity() + ".");
            }

            printWriter.close();
        } catch (IOException e) {
            System.err.printf("Error writing the file : ", e.getMessage());
        }

    }

    public String getTotalQty() {

        String sentence="";
        for (Product product : products) {

            sentence+= "Product : " + product.getName() + ", Quantity : "+ product.getQuantity()+".";
        }
        return sentence;
    }



    public double getTotalValue() {
            double totalValue = 0.0;

            for (Product product : products) {
                totalValue += product.getPrice() * product.getQuantity();
            }

            return totalValue;
        }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }



}





