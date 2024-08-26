package thuchanh2;

import java.io.IOException;
import java.util.Scanner;

public class ReadDataExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();
        System.out.println("Nhập tên file cần đọc:");
        String fileName = scanner.nextLine();

        try {
            String resultData = fileHandler.readData(fileName);
            System.out.println("Dữ liệu trong file " + fileName + ":");
            System.out.println(resultData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
