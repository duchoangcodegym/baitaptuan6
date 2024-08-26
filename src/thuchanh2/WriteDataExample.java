package thuchanh2;

import java.io.IOException;
import java.util.Scanner;

public class WriteDataExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();
        System.out.println("Nhập dữ liệu cần ghi vào file:");
        String inputData = scanner.nextLine();
        String fileName = "data.dat";

        try {
            boolean result = fileHandler.writeData(inputData, fileName);
            if (result) {
                System.out.println("Ghi dữ liệu thành công vào file " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
