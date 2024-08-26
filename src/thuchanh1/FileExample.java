package thuchanh1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        try {
            File file = new File("person.dat");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào một chuỗi:");
            String inputString = scanner.nextLine();
            fos.write(inputString.getBytes());
            FileInputStream fis = new FileInputStream(file);
            int content;
            System.out.println("Dữ liệu trong file:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
