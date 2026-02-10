package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 2002;
        int atempt = 0;

        while (atempt != password){
            atempt = sc.nextInt();
            if (atempt != password){
                System.out.println("INCORRECT PASSWORD!");
            }
        }
        System.out.println("Permitted access");
    }
}
