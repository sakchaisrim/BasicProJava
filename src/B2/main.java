package B2;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Scanner(System.in)
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter key: ");
        // scan -> instance
        short store = scan.nextByte();
        System.out.printf("Store= \n" + store);

        System.out.println("\nEnter String: ");
        String str = scan.next();
        System.out.printf("Str= "+ str);
    }
}
