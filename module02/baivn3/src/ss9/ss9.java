package ss9;
import java.util.Scanner;
public class ss9 {
    public static void main(String[] args) {
        // khai bao mang gom 10 so nguyen to
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phan tu muon xoa: ");
        int X = scanner.nextInt();

        // tim xem x co trong mang khong, hien thi
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        // truong hop khong co
        if (index_del == -1) {
            System.out.println("khong tim thay gia tri nao trung hop");
            return;
        }

        // xoa
        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // hien thi ket qua
        System.out.println("ket qua sau khi da xoa:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}