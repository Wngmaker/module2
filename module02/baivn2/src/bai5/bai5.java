package bai5;

public class bai5 {
    public static void main(String[] args) {
        boolean check = true;
        int number = 1;
        while (check) {
            if (number % 5 == 0 && number % 7 == 0 && number % 11 == 0) {
                check = false;
            } else {
                number++;
            }
        }
        if (check == false) {
            System.out.println("so chia het cho 5 7 11 la" + number);
        }
    }
}