package bai 5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm toán");
        float diemToan= sc.nextFloat();
        System.out.println("nhập điểm lý");
        float diemLy= sc.nextFloat();
        System.out.println("nhập điểm hóa");
        float diemHoa= sc.nextFloat();
        System.out.println("nnhập điểm văn");
        float diemVan= sc.nextFloat();
        System.out.println("nhập điểm anh");
        float diemAnh= sc.nextFloat();
        float diemTb= (diemToan+diemLy+diemHoa+diemVan+diemAnh)/5;
        if(diemTb>=0&&diemTb<5 ){
            System.out.println("Xếp loại yếu ");
        } else if (diemTb>=5&&diemTb<6) {
            System.out.println("Xếp loại trung bình.");
        } else if (diemTb>=6&&diemTb<8) {
            System.out.println("Xếp loại khá ");
        } else if (diemTb>=8&&diemTb<9) {
            System.out.println("Xếp loại giỏi");
        }else {
            System.out.println(" Xếp loại xuất sắc");
        }
    }
}