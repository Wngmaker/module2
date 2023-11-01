package ss5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap so hang ");
        int hang = sc.nextInt();
        System.out.print("nhap so cot ");
        int cot = sc.nextInt();
        double [][] mangSoNguyen = new double[hang][cot];
        System.out.println("nhap gia tri cho tung phan tu cua mang: ");
        for (int i = 0; i <hang ; i++) {
            for (int j = 0; j <cot ; j++) {
                mangSoNguyen[i][j]=sc.nextDouble();
            }
        }
        double minValue = mangSoNguyen[0][0];
        int hangIndex= 0;
        int cotIndex = 0;
        for (int i = 0; i <hang ; i++) {
            for (int j = 0; j <cot ; j++) {
                if (minValue>mangSoNguyen[i][j]){
                    minValue= mangSoNguyen[i][j];
                    hangIndex= i;
                    cotIndex= j;
                }
            }
        }
        System.out.println("gia tri nho nhat trong mang la " + minValue);
    }
}
