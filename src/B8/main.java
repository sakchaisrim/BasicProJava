package B8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Authentication system
        Scanner scan = new Scanner(System.in);

        boolean validCode = false;
        String code = "";

        while (validCode == false) {
            System.out.print("Enter Password: ");
            code = scan.next();
            if(code.equals("1234")){
                validCode = true;
            }
        }
        System.out.println("Success!");
    }
}
