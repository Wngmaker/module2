package bai4;

import java.util.Scanner;

public class bai4{
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to can hien thi dau tien");
        int soLuongSNTDauTien = Integer.parseInt(sc.nextLine());
        System.out.println(soLuongSNTDauTien +" số nguyên tố đầu tiên " + " là:");

        int soSNTDaTimThay = 0;
        int i = 2;

        while (soSNTDaTimThay < soLuongSNTDauTien) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
                soSNTDaTimThay++;
            }
            i++;
        }
    }
}