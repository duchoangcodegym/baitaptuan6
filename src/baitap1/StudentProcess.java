package baitap1;

import java.io.*;

public class StudentProcess {
    public static boolean writeStudents(Student[] students, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static Student[] readStudent(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Student[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new Student[0];
        }
    }
}
