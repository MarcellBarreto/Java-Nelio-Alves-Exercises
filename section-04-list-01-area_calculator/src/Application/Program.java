package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangle = (a * c) / 2;
        double areaCircle = (c * c) * Math.PI;
        double areatrapezoid = (a + b) * c / 2;
        double areaSquare = b * b;
        double areaRectangle = a * b;

        System.out.printf("TRIANGLE: %.3f", areaTriangle);
        System.out.printf("\nCIRCLE: %.3f", areaCircle);
        System.out.printf("\nTRAPEZOID: %.3f", areatrapezoid);
        System.out.printf("\nSQUARE: %.3f", areaSquare);
        System.out.printf("\nRECTANGLE: %.3f", areaRectangle);
    }
}
