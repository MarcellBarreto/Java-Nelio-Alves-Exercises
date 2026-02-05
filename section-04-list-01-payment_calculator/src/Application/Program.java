package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iten1 = sc.nextInt();
        int qntddIten1 = sc.nextInt();
        double valueIten1 = sc.nextDouble();

        int iten2 = sc.nextInt();
        int qntddIten2 = sc.nextInt();
        double valueIten2 = sc.nextDouble();

        double totalToPay = qntddIten1 * valueIten1 + qntddIten2 * valueIten2;

        System.out.printf("TOTAL VALUE TO PAY: U$ %.2f%n", totalToPay);
    }
}
