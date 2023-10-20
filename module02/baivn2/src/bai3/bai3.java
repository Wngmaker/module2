package bai3;

public class bai3 {
    public static boolean lasonguyento(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int j = 2; j <= 100; j++) {
            if (lasonguyento(j)) {
                System.out.println(j);
            }
        }
    }
}