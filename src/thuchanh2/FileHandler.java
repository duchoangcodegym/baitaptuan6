package thuchanh2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandler {
    public String readData(String fileName) throws IOException {
        FileInputStream fis = null;
        StringBuilder resultData = new StringBuilder();
        try {
            fis = new FileInputStream(fileName);
            int content;
            while ((content = fis.read()) != -1) {
                resultData.append((char) content);
            }
            return resultData.toString();
        } catch (IOException e) {
            throw e;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Phương thức writeData để ghi dữ liệu vào file
    public boolean writeData(String data, String fileName) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            fos.write(data.getBytes());
            return true;
        } catch (IOException e) {
            throw e;
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
