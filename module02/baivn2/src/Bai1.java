import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Nhập giá trị đầu và cuối từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị đầu của khoảng: ");
        int start = scanner.nextInt();
        System.out.print("Nhập giá trị cuối của khoảng: ");
        int end = scanner.nextInt();

        // Tính tổng các số chẵn trong khoảng
        int total = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {  // Kiểm tra xem số hiện tại có phải là số chẵn không
                total += i;
            }
        }

        // thị tổng ra màn hình
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là " + total);
    }
}

