package baitap1;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("S001", "Nguyen Van A", 20, "CodeGym"),
                new Student("S002", "Le Thi B", 19, "CodeGym"),
                new Student("S003", "Tran Van C", 20, "CodeGym"),
                new Student("S004", "Hoang Thi D", 19, "CodeGym"),
                new Student("S005", "Phan Van E", 20, "CodeGym")
        };
        String fileName = "students.dat";
        boolean success = StudentProcess.writeStudents(students, fileName);
        if (success) {
            System.out.println("Đã ghi danh sách sinh viên vào file.");
        } else {
            System.out.println("Ghi danh sách sinh viên thất bại.");
        }
        Student[] readStudents = StudentProcess.readStudent(fileName);
        System.out.println("Danh sách sinh viên đọc từ file:");
        for (Student student : readStudents) {
            System.out.println(student);
        }
    }
}
