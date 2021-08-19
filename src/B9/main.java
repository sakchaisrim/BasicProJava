package B9;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // separate number

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scan.nextInt();
        int d, remain;
        String str ="";
        remain =n;

        do{
            d = remain % 10;
            str += d + "\n";
            remain = (int) (remain /10);
        }while(remain !=0);

        System.out.println("Sep num: \n" +str);

    }


}
