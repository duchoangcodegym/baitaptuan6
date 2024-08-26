package baitap2;

import java.util.ArrayList;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("P001", "Laptop Dell", 1500.0, "Dell"));
        productList.add(new Product("P002", "Laptop HP", 1300.0, "HP"));
        productList.add(new Product("P003", "Laptop Lenovo", 1200.0, "Lenovo"));
        productList.add(new Product("P004", "Laptop Asus", 1400.0, "Asus"));
        productList.add(new Product("P005", "Laptop Apple", 2000.0, "Apple"));

        String fileName = "products.dat";
        if (ProductProcess.writeProducts(productList, fileName)) {
            System.out.println("Đã ghi danh sách sản phẩm vào file.");
        } else {
            System.out.println("Ghi danh sách sản phẩm thất bại.");
        }
        Product[] productsFromFile = ProductProcess.readProducts(fileName);
        System.out.println("Danh sách sản phẩm đọc từ file:");
        for (Product product : productsFromFile) {
            System.out.println(product);
        }
    }
}
