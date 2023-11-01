package ss3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap kich thuoc mang dau tien: ");
        int kichThuocMang1 = sc.nextInt();
        int[] arr1 = new int[kichThuocMang1];
        System.out.println("hay nhap kich thuoc mang thu hao: ");
        int kichThuocMang2 = sc.nextInt();
        int[] arr2 = new int[kichThuocMang2];
        int[] arr3 = new int[kichThuocMang1+ kichThuocMang2 ];
        System.out.println("gan gia tri cho mang 1 ");
        for (int i = 0; i <kichThuocMang1 ; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("gan gia tri cho mang 2 ");
        for (int i = 0; i <kichThuocMang2 ; i++) {
            arr2[i]= sc.nextInt();
        }
        for (int i = 0; i <kichThuocMang1 ; i++) {
            arr3[i]= arr1[i];
        }
        for (int i = 0; i <kichThuocMang2 ; i++) {
            arr3[kichThuocMang1+i]= arr2[i] ;
        }
        System.out.println("mang 3 co ca gia tri la: ");
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}