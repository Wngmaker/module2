package ss7;

import java.util.Scanner;
public class ss7 {
    public static void main(String[] args) {
        // khai bao 2 mang
        int[] array1 = new int[10];
        int[] array2 = new int[20];

        // nhap gia tri 2 mang
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        // gop 2 mang vua khai vzao mang moi
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // in ra mot mang moi
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}