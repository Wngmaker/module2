package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật (Rectangle)\n" +
                    "2. In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                    "3. In hình tam giác cân ( Isosceles triangle)\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị hình chữ nhật
                    System.out.println("nhap chieu dai");
                    int chieudai =Integer.parseInt(sc.nextLine());
                    System.out.println("nhap chieu rong");
                    int chieurong = Integer.parseInt(sc.nextLine());
                    for (int i = 1;i <= chieurong;i++){
                        for (int j = 1 ; j <= chieudai;j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("a. Trên cùng bên trái (top-left) \n" +
                            "b. Trên cùng bên phải( top-right)\n" +
                            "c. Dưới cùng bên trái( bottom-left) \n" +
                            "d. Dưới cùng bên phải(bottom-right)\n");
                    System.out.println("nhập lựa chọn của bạn");
                    String next = sc.nextLine();
                    switch (next) {
                        case "a":
                            sc.nextLine();
                            break;
                        case "b":
                            sc.nextLine();
                            break;
                        case "c":
                            sc.nextLine();
                            break;
                        case "d":
                            sc.nextLine();
                            break;
                        default:
                            System.out.println("nhập lại");

                    }
                    break;
                case 3:
                    System.out.print("Nhập chiều cao của tam giác: ");
                    int chieuCao = Integer.parseInt(sc.nextLine());

                    for (int i = 1; i <= chieuCao; i++) {
                        for (int j = 1; j <= chieuCao - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
//                    System.exit(0);
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("nhập không hợp lệ");
            }

            if (choice == 4){
                break;
            }
        }
    }

}