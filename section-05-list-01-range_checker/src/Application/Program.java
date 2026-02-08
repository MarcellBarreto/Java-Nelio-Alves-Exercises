package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n > 0 && n <= 25){
            System.out.printf("RANGE [0,25]");
        } else if (n > 25 && n <= 50) {
            System.out.printf("RANGE [25,50]");
        }else if (n > 50 && n <= 75) {
            System.out.printf("RANGE [50,75]");
        }else if (n > 75 && n <= 100) {
            System.out.printf("RANGE [75,100]");
        } else {
            System.out.printf("Out of range!");
        }

        sc.close();
    }
}
