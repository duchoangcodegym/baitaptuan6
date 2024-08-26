package thuchanh3;

import java.io.*;

public class ProductProcess {
    public static boolean writeObjectData(Product objProduct, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(objProduct);
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public Product[] readObjectData(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Product product = (Product) ois.readObject();
            return new Product[]{product};
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
