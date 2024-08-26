package thuchanh3;

public class ProductApp {
    public static void main(String[] args) {
        // Tạo đối tượng objProduct1 với phương thức khởi tạo không tham số
        Product objProduct1 = new Product();
        objProduct1.setProID("P001");
        objProduct1.setProName("Laptop Dell");
        objProduct1.setPrice(1500);
        Product objProduct2 = new Product("P002", "Laptop HP", 1200);
        ProductProcess productProcess = new ProductProcess();
        String fileName = "object.dat";
        boolean isWritten1 = ProductProcess.writeObjectData(objProduct1, fileName);
        boolean isWritten2 = ProductProcess.writeObjectData(objProduct2, fileName);
        if (isWritten1 && isWritten2) {
            System.out.println("Ghi dữ liệu thành công.");
        } else {
            System.out.println("Ghi dữ liệu thất bại.");
        }
        Product[] listProduct = productProcess.readObjectData(fileName);
        if (listProduct != null) {
            for (Product product : listProduct) {
                System.out.println(product);
            }
        } else {
            System.out.println("Không đọc được dữ liệu từ file.");
        }
    }
}
