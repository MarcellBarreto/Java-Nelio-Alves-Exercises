package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Double radius = sc.nextDouble();

        Double area = (radius * radius) * Math.PI;

        System.out.printf("A = %.4f", area);

    }
}
