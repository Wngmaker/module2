package bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2.Kiểm tra số nguyên tố.\n" +
                    "3.Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4.Thoát\n");
            System.out.println("bam so de chon");
            double choice = Double.parseDouble(sc.nextLine());
            switch ((int)choice){
                case 1:
                    System.out.println("nhap so can kiem tra");
                    int number = Integer.parseInt(sc.nextLine());
                    if (number % 2 == 0){
                        System.out.println("so chan");
                    }else {
                        System.out.println("so le");
                    }
                    break;
                case 2:
                    System.out.println("nhap so can kiem tra");
                    int number1 = Integer.parseInt(sc.nextLine());
                    boolean check = true;
                    if (number1 <= 1){
                        check =false;
                        System.out.println(number1 +"ko phai so nguyen to");
                    }
                    for (int i = 2 ; i <= Math.sqrt(number1);i++){
                        if ( number1 % i ==0){
                            check =false;
                        }else {
                            System.out.println(number1 +"la so nguyen to");
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhap so can kiem tra");
                    int number2 = Integer.parseInt(sc.nextLine());
                    if (number2 % 3==0){
                        System.out.println(number2 + "chia het cho 3");
                    }else {
                        System.out.println(number2 + "ko chia het cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("thoat truong trinh");
                default:
                    System.out.println("nhap ko hop le");
            }
            if (choice ==4){
                break;
            }
        }
    }
}