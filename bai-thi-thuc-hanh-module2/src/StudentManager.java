import java.io.*;
import java.util.*;

public class StudentManager {
    private static final String FILE_PATH = "students.csv";
    private List<Student> students = new ArrayList<>();

    public StudentManager() {
        loadStudentsFromFile();
    }

    // Đọc danh sách sinh viên từ file CSV
    private void loadStudentsFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {  // Đảm bảo dữ liệu đủ 6 cột
                    Student student = new Student(
                            Integer.parseInt(data[0]), data[1], data[2], data[3], data[4], data[5]
                    );
                    students.add(student);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Lỗi khi đọc file CSV: " + e.getMessage());
        }
    }

    // Ghi danh sách sinh viên vào file CSV
    private void saveStudentsToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student student : students) {
                String csvLine = String.join(",",
                        String.valueOf(student.getStudentId()),
                        student.getName(),
                        student.getDob(),
                        student.getGender(),
                        student.getPhone(),
                        student.getClassId()
                );
                bw.write(csvLine);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file CSV: " + e.getMessage());
        }
    }

    // Thêm mới sinh viên
    public void addStudent(Scanner scanner) {
        int newId = students.isEmpty() ? 1 : students.get(students.size() - 1).getStudentId() + 1;

        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        String dob = scanner.nextLine();
        System.out.print("Nhập vào giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        System.out.print("Nhập mã lớp học: ");
        String classId = scanner.nextLine();

        Student student = new Student(newId, name, dob, gender, phone, classId);
        students.add(student);
        saveStudentsToFile();
        System.out.println("Đã thêm sinh viên thành công!");
    }

    // Xóa sinh viên
    public void removeStudent(Scanner scanner) {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getStudentId() == id) {
                System.out.print("Bạn có chắc chắn muốn xóa (Yes/No)? ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Yes")) {
                    iterator.remove();
                    saveStudentsToFile();
                    System.out.println("Xóa thành công.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    // Hiển thị danh sách sinh viên
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
