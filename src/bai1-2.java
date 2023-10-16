package bai2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số Đô bạn muốn đổi:");
        int number = sc.nextInt();
        System.out.print("ra tiền Việt Nam Đồng là: "+ (rate*number));
    }
}