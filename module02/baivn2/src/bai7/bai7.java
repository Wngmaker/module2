package bai7;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("Menu Chức Năng:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            System.out.print("Chọn chức năng (1/2/3/4): ");
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    tinhChuViDienTichHinhChuNhat();
                    break;
                case 2:
                    tinhChuViDienTichHinhTamGiac();
                    break;
                case 3:
                    tinhChuViDienTichHinhTron();
                    break;
                case 4:
                    System.out.println("Ứng dụng kết thúc.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 4);
    }

    public static void tinhChuViDienTichHinhChuNhat() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc1.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc1.nextDouble();

        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi hình chữ nhật: " + chuVi);
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTamGiac() {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc2.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc2.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc2.nextDouble();

        double chuVi = a + b + c;
        double p = chuVi / 2;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi hình tam giác: " + chuVi);
        System.out.println("Diện tích hình tam giác: " + dienTich);
    }

    public static void tinhChuViDienTichHinhTron() {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double banKinh = sc3.nextDouble();

        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;

        System.out.println("Chu vi hình tròn: " + chuVi);
        System.out.println("Diện tích hình tròn: " + dienTich);
    }
}