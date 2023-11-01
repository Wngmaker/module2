package ss1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap  ");
        int giaTri = sc.nextInt();
        int[] arr = new  int[giaTri];
        System.out.println("moi nhap  " +giaTri+" gia tri");
        for (int i = 0; i <giaTri ; i++) {
            arr[i]= sc.nextInt()
        }
        // in ra mang
        System.out.println("mang vua tao la: ");
        for (int i = 0; i <giaTri ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("nhap gia tri muon xoa ");
        int x = sc.nextInt();
        int n = giaTri;
        for (int i = 0; i <giaTri ; i++) {
            if (arr[i]==x){
                for (int j = i; j < giaTri - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }
        // in ra sau khi xoa
        System.out.println("mang sau khi xoa gia tri " + x + " là:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}