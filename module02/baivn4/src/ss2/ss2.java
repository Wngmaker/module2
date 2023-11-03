package ss2
import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị cho b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị cho c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm thứ nhất: " + equation.getRoot1());
            System.out.println("Nghiệm thứ hai: " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("Phương trình có một nghiệm: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
