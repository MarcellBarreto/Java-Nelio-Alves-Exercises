package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b % a == 0){
            System.out.println("They are Multiplos");
        } else {
            System.out.println("They are not Multiples");
        }
    }
}
