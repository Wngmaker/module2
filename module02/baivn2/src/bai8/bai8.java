package bai8;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        boolean hopLe = false;

        while (true) {
            System.out.print("Nhập cạnh a: ");
            a = sc.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = sc.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = sc.nextDouble();

            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                hopLe = true;
                break;
            } else {
                System.out.println("Ba cạnh không tạo thành tam giác hoặc không hợp lệ. Vui lòng nhập lại.");
            }
        }

        if (hopLe) {
            double chuVi = a + b + c;
            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("Chu vi tam giác: " + chuVi);
            System.out.println("Diện tích tam giác: " + dienTich);
        }
    }
}