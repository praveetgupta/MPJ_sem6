import java.util.Scanner;

class GeometricFigure {
    double result;

    GeometricFigure() {
        result = 0;
    }

    GeometricFigure(double s) {
        result = s * s;
        System.out.println("Square Area = " + result);
    }

    GeometricFigure(double l, double b) {
        result = l * b;
        System.out.println("Rectangle Area = " + result);
    }

    void calculateArea(double r) {
        result = Math.PI * r * r;
        System.out.println("Circle Area = " + result);
    }

    void calculateArea(double b, double h, boolean flag) {
        if (flag) {
            result = 0.5 * b * h;
            System.out.println("Triangle Area = " + result);
        }
    }
}

public class Lab_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Side of square: ");
        double side = input.nextDouble();
        GeometricFigure fig1 = new GeometricFigure(side);

        System.out.print("Length of rectangle: ");
        double len = input.nextDouble();
        System.out.print("Breadth of rectangle: ");
        double brd = input.nextDouble();
        GeometricFigure fig2 = new GeometricFigure(len, brd);

        GeometricFigure fig3 = new GeometricFigure();
        System.out.print("Radius of circle: ");
        double rad = input.nextDouble();
        fig3.calculateArea(rad);

        System.out.print("Base of triangle: ");
        double base = input.nextDouble();
        System.out.print("Height of triangle: ");
        double ht = input.nextDouble();
        fig3.calculateArea(base, ht, true);

        input.close();
    }
}