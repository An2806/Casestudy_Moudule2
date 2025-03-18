import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();

        while (true) {
            System.out.println("\n=== QUẢN LÝ SINH VIÊN ===");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Xoá sinh viên");
            System.out.println("3. Xem danh sách sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số hợp lệ.");
                continue;
            }

            switch (choice) {
                case 1:
                    studentManager.addStudent(scanner);
                    break;
                case 2:
                    studentManager.removeStudent(scanner);
                    break;
                case 3:
                    studentManager.displayStudents();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
