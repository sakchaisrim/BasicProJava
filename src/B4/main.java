package B4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // ATM withDraw

        Scanner scan = new Scanner(System.in);

        System.out.print("จำนวนเงินที่ถอน: ");
        int withDraw = scan.nextInt();
        int b1000 = (int) (withDraw / 1000 );

        int remain = withDraw % 1000;
        int b500 = (int) (remain / 500);

        remain = remain % 500;
        int b100 = (int) (remain / 100);

        System.out.println("ธนบัตรที่ได้รับ");
        System.out.println("B1000: "+ b1000);
        System.out.println("B500: "+ b500);
        System.out.println("B100: "+ b100);
        scan.close();

    }
}
