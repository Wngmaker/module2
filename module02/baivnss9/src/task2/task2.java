package task2
import java.util.Scanner;
import java.util.Stack;

public class task2 {
    public static void main(String[] args) {
        // Bước 1: Tạo stack để lưu trữ từng từ
        Stack<String> wordStack = new Stack<>();

        // Bước 2: Nhập số lượng từ
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng từ: ");
        int numberOfWords = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        // Bước 3: Nhập từng từ và push vào stack
        for (int i = 1; i <= numberOfWords; i++) {
            System.out.print("Nhập từ thứ " + i + ": ");
            String word = scanner.nextLine();
            wordStack.push(word);
        }

        // Bước 4: In ra từng từ theo thứ tự đảo ngược
        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!wordStack.isEmpty()) {
            System.out.println(wordStack.pop());
        }

        // Đóng Scanner
        scanner.close();
    }
}
