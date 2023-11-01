package ss8;
import java.util.Scanner;
public class ss8 {
    public static void main(String[] args) {
        // khai bao mang gom 10 so
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("moi nhap so can chen: ");
        int X = scanner.nextInt();

        System.out.print("nhap vi tri chen vao trong mang ");
        int index = scanner.nextInt();

        if (index <= -1 || index >= array.length) {
            System.out.println("khong the chen vao duoc");
            return;
        }
        // duyet mang ty vi tri cho den het
        for (int i = array.length - 1; i >= index; i--) {

            array[i] = array[i - 1];
        }

        // gan tri tri vao
        array[index] = X;

        // in ra ket qua
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}