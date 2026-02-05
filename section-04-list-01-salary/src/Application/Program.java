package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        int workedHours = sc.nextInt();
        double salaryPerHour = sc.nextDouble();

        double salary = salaryPerHour * workedHours;

        System.out.printf("NUMBER = %d", employeeNumber);
        System.out.printf("\nSALARY = U$ %.2f", salary);
    }
}
