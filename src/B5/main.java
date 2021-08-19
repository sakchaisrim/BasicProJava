package B5;

import java.util.Scanner;

public class main {
    // Max input
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max;

        System.out.println("Num1: ");
        int n1 = scan.nextInt();
        max = n1;

        System.out.println("Num2: ");
        int n2 = scan.nextInt();

        // ternary operator -> ()? True: false
        //max = (n2 > max)? n2: max;
        if(n2 > max) {
            max = n2;
        }
        System.out.println("Num3: ");
        int n3 = scan.nextInt();
        max = (n3 > max)? n3: max;

        System.out.println("\nMax= "+ max);

    }

}
