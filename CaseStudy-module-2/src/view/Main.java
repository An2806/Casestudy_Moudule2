package view;

import controller.DinerController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DinerController controller = new DinerController();

        while (true) {
            System.out.println("\n=== DINER MANAGEMENT SYSTEM ===");
            System.out.println("1. Thêm món ăn / đồ uống");
            System.out.println("2. Tìm kiếm món ăn theo tên");
            System.out.println("3. Hiển thị danh sách món ăn");
            System.out.println("4. Tính tổng doanh thu");
            System.out.println("5. Lưu thực đơn ra file CSV");
            System.out.println("6. Lưu thực đơn ra file nhị phân");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Thêm món ăn
                    System.out.print("Nhập loại (food/drink): ");
                    String type = scanner.nextLine();
                    System.out.print("Nhập tên món/ đồ uống: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập số lượng: ");
                    double soluong = scanner.nextDouble();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    controller.addMenu(type, name, price);
                    break;

                case 2:
                    System.out.println("Nhập tên món cần tìm: ");
                    String searchName = scanner.nextLine();
                    controller.searchMenuByName(searchName);
                    break;

                case 3:
                    controller.displayMenu();
                    break;

                case 4:
                    controller.calculateTotalRevenue();
                    String totalRevenue = "";
                    System.out.println("Tổng doanh thu: " + totalRevenue + " VNĐ");
                    break;

                case 5:
                    System.out.println("Nhập tên file CSV để lưu: ");
                    String csvFile = scanner.nextLine();
                    controller.saveMenuToCSV(csvFile);
                    break;

                case 6: // Lưu thực đơn ra file nhị phân
                    System.out.print("Nhập tên file nhị phân để lưu: ");
                    String binaryFile = scanner.nextLine();
                    controller.saveMenuToToBinary(binaryFile);
                    break;

                case 0: // Thoát
                    System.out.println("Thoát chương trình.");
                    System.exit(0);

                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}