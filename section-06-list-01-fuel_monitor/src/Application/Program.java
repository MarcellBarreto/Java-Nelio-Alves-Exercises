package Application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        int x = 0;
        while (x != 4){
            x = sc.nextInt();
            if(x == 1){
                alcohol++;
            } else if (x == 2){
                gasoline++;
            } else if (x == 3) {
                diesel++;
            }
        }

        System.out.println("Thanks");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gasoline: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
