package ss1;


import java.util.Scanner;

public class Circle {
    // Thuộc tính
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuVi(){
        return 2*Math.PI*radius;
    }
    public double dienTich(){
        return Math.PI*radius*radius;
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kình hình tròn ");
        this.radius  = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào màu sắc hình tròn");
        this.color = scanner.nextLine();
    }
    public void displayData(){
        System.out.println("thông tin cuả hình tròn :");
        System.out.println("Bán kính : " +radius +" | Màu sắc : "+color);
    }
}
}
