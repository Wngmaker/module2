import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        float chieudai = Float.parseFloat(sc.nextLine());
        System.out.println("nhap chieu rong");
        float chieurong =Float.parseFloat(sc.nextLine());
        float chuvi = (chieurong+chieudai)*2;
        float dientich=chieudai*chieurong;
        System.out.println("chu vi hinh chu nhat la" + chuvi);
        System.out.println("dien tich hinh chu nhat la"+dientich);

    }
}