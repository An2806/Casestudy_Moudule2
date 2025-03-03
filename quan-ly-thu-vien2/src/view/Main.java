package view;

import controller.LibraryController;

import java.util.Scanner;

public class Main {
    public static <LibraryController> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryController controller = new LibraryController();

        while (true) {
            System.out.println("\n=== QUẢN LÝ THƯ VIỆN ===");
            System.out.println("1. Thêm sách / truyện");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Hiển thị danh sách sách / truyện");
            System.out.println("4. Tính tổng doanh thu");
            System.out.println("5. Lưu danh sách ra file CSV");
            System.out.println("6. Lưu danh sách ra file nhị phân");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1: // Thêm sách hoặc truyện
                    System.out.print("Nhập loại (book/comic): ");
                    String type = scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Đọc bỏ dòng trống

                    controller.addItem(type, name, price);
                    break;

                case 2: // Tìm kiếm sách/truyện theo tên
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    controller.searchByName(searchName);
                    break;

                case 3: // Hiển thị toàn bộ danh sách
                    controller.finalize();
                    break;

                case 4: // Tính tổng doanh thu
                    double totalRevenue = controller.clone();
                    System.out.println("Tổng doanh thu từ sách/truyện: " + totalRevenue + " VNĐ");
                    break;

//                case 5: // Lưu danh sách ra file CSV
//                    System.out.print("Nhập tên file CSV để lưu: ");
//                    String csvFile = scanner.nextLine();
//                    controller.saveToCSV(csvFile);
//                    break;
//
//                case 6: // Lưu danh sách ra file nhị phân
//                    System.out.print("Nhập tên file nhị phân để lưu: ");
//                    String binaryFile = scanner.nextLine();
//                    controller.saveToBinary(binaryFile);
//                    break;

                case 0: // Thoát chương trình
                    System.out.println("Thoát chương trình quản lý thư viện.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
