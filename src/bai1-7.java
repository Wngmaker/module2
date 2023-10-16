package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số bất kỳ");
        int number = sc.nextInt();
        String word= "";
        if(number<0&&number>9){
            System.out.println("Số không hợp lệ");
        } else {
            switch (number){
                case 1:
                    word = "một" ;
                    break;
                case 2 :
                    word = "hai";
                    break;
                case 3 :
                    word = "ba";
                    break;
                case 4 :
                    word = "bốn";
                    break;
                case 5 :
                    word = "năm";
                    break;
                case 6 :
                    word = "sáu";
                    break;
                case 7 :
                    word = "bảy";
                    break;
                case 8 :
                    word = "tám";
                    break;
                case 9 :
                    word = "chín";
                    break;
            }
        }
        System.out.println(word);
    }
}