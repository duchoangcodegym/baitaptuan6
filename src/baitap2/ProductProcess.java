package baitap2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductProcess {
    public static boolean writeProducts(List<Product> productList, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(productList);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static Product[] readProducts(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Product> productList = (List<Product>) ois.readObject();
            return productList.toArray(new Product[0]);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Product[0];
        }
    }
}
