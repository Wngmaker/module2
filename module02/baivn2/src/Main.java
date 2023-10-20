import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println("xin lỗi lần thứ" + i);
        }
        // do while va while: ung dung cho vong lap chua biet truoc so lan lap lai
        int number;
        do {
            System.out.println("Nhap vao 1 so nguyên > 0");
            number = sc.nextInt();
        } while (number < 0);
        System.out.println("number = " + number);

         number = -1;
        while (number<0){
            System.out.println("nhap vao 1 so nguyen lon hon 0");
            number  = sc.nextInt();
            System.out.println(number);
        }
        // vong lap long nhau

    }



}