package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int itemCode = sc.nextInt();
        int itemQuantity = sc.nextInt();
        double totalToPay = 0;

        if (itemCode == 1){
            totalToPay = 4.00 * itemQuantity;
            System.out.printf("TOTAL: R$ %.2f", totalToPay);
        } else if (itemCode == 2) {
            totalToPay = 4.50 * itemQuantity;
            System.out.printf("TOTAL: R$ %.2f", totalToPay);
        } else if (itemCode == 3) {
            totalToPay = 5.00 * itemQuantity;
            System.out.printf("TOTAL: R$ %.2f", totalToPay);
        } else if (itemCode == 4) {
            totalToPay = 2.00 * itemQuantity;
            System.out.printf("TOTAL: R$ %.2f", totalToPay);
        } else if (itemCode == 5) {
            totalToPay = 1.50 * itemQuantity;
            System.out.printf("TOTAL: R$ %.2f", totalToPay);
        } else {
            System.out.println("ERRO \nEnter a valid item code!!");
        }

        sc.close();
    }
}
