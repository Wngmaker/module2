package task1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // Bước 1: Tạo queue để lưu trữ phần tử
        Queue<String> myQueue = new LinkedList<>();

        // Bước 2: Nhập số lượng phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử: ");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự xuống dòng

        // Bước 3: Nhập từng phần tử và enqueue vào queue
        for (int i = 1; i <= numberOfElements; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            String element = scanner.nextLine();
            myQueue.add(element);
        }

        // Bước 4: In ra từng phần tử theo thứ tự dequeue
        System.out.println("Các phần tử trong queue:");
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }

        // Đóng Scanner
        scanner.close();
    }
}

