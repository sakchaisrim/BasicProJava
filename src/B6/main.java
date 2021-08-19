package B6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String mobile;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Mobile: ");
        mobile = scan.next();

        switch (mobile) {
            case "samsung": System.out.println("Android"); break;
            case "sony": System.out.println("Android"); break;
            case "iphone": System.out.println("IOS"); break;
            default: {
                System.out.print("OS");
                System.out.println(" Unknown");
            }
        }
    }
}
