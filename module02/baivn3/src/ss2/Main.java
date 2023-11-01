package ss2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong mang ");
        int number = sc.nextInt();
        int[] mangSoNguyen = new  int[number];
        System.out.println("cac phan tu cua mang la ");
        for (int i = 0; i <number ; i++) {
            mangSoNguyen[i]= sc.nextInt();
        }
        System.out.println("in cac phan tu cua mang"+ Arrays.toString(mangSoNguyen));
        System.out.println("nhap gia tri can chen vao ");
        int x = sc.nextInt();
        int index ;
        while (true){
            System.out.println("nhap vi tri muon chen ");
            index = sc.nextInt();
            if (index >= 0 && index <= number){
                break;
            }else {
                System.out.println("ban da nhap sai, hay nhap lai ");
            }
        }
        int[] newArr= new int[number+1];
        for (int i = 0; i <index ; i++) {
            newArr[i]= mangSoNguyen[i];
        }

        for (int i = index; i <number ; i++) {
            newArr[i+1]= mangSoNguyen[i];
        }
        System.out.println("gia tri mang sau khi da sua la: " + Arrays.toString(newArr));
    }
}
