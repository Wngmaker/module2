package ss6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so dong cua ma tran: ");
        int m = scanner.nextInt();
        System.out.print("nhap so cot cua ma tran: ");
        int n = scanner.nextInt();

        // tao ma tran
        double[][] maTran = new double[m][n];

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                System.out.print("nhap vao gia tri cua ma tran[" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextDouble();
            }
        }

        double max = maTran[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i < maTran.length; i++) {
            for (int j = 0; j < maTran[i].length; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                    x = i;
                    y = j;
                }
            }
        }

        //  hien thi ket qua
        System.out.println("toa do cua phan tu lon nhat la: (" + x + ", " + y + ")");
        System.out.println("gia tri cua phan tu: " + max);
    }
}