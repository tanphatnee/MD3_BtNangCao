package BtNangCao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ClassList {
    private List<Student> students;
    private List<Student> removedStudents;

    public ClassList() {
        students = new ArrayList<>();
        removedStudents = new ArrayList<>();
        // Thêm các sinh viên vào danh sách lớp
        students.add(new Student(1, "Nguyễn Văn Tấn Phát"));
        students.add(new Student(2, "Phạm Trung Hải"));
        students.add(new Student(3, "Bùi Đình Huân"));
        students.add(new Student(4, "Lâm Quang Hải"));
        students.add(new Student(5, "Phan Hoàng Hiếu"));
        students.add(new Student(6, "Nguyễn Thị Hồng Nhung"));
        students.add(new Student(7, "Lê Thế Thùy"));
        students.add(new Student(8, "Dương Ngọc Thanh Long"));
        students.add(new Student(9, "Đặng Trường Giang"));
        students.add(new Student(10, "Phạm Tuấn Linh"));
        students.add(new Student(11, "Nguyễn Quang Huy"));
        students.add(new Student(12, "Võ Văn Duy"));
        students.add(new Student(13, "Trần Hữu Huy"));
        students.add(new Student(14, "Phạm Tuấn Bình"));
        students.add(new Student(15, "Nguyễn Tuấn Hưng"));
        students.add(new Student(16, "Nguyễn Phi Hùng"));
        students.add(new Student(17, "Trần Bá Cường"));
        students.add(new Student(18, "Nguyễn Trung Hiếu"));
        students.add(new Student(19, "Lê Duy Khánh"));
        students.add(new Student(20, "Đặng Trần Tiệp"));
    }

    public void displayClassList() {
        System.out.println("Danh sách lớp:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Tên: " + student.getName());
        }
    }

    public void getRandomStudents(int num) {
        if (num <= 0 || num > students.size()) {
            System.out.println("Số lượng không hợp lệ!");
            return;
        }

        Random random = new Random();
        System.out.println("Các sinh viên ngẫu nhiên:");
        for (int i = 0; i < num; i++) {
            int randomIndex = random.nextInt(students.size());
            Student randomStudent = students.get(randomIndex);
            System.out.println("ID: " + randomStudent.getId() + ", Tên: " + randomStudent.getName());
            removedStudents.add(randomStudent);
            students.remove(randomIndex);
        }
    }

    public void displayNewClassList() {
        System.out.println("Danh sách lớp mới:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Tên: " + student.getName());
        }
    }

    public static void main(String[] args) {
        ClassList classList = new ClassList();
        classList.displayClassList();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-------- Menu --------");
            System.out.println("1. Lấy ngẫu nhiên danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách lớp mới");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên muốn lấy: ");
                    int numStudents = scanner.nextInt();
                    classList.getRandomStudents(numStudents);
                    break;
                case 2:
                    classList.displayNewClassList();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại!");
            }
        }

        System.out.println("Chương trình đã kết thúc.");
    }
}
