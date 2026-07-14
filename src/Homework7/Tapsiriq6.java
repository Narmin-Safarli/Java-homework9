package Homework7;

import java.util.Scanner;
public class Tapsiriq6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uçuş kodunun ilk 2 hərfini daxil et: ");
        String kod = sc.next();

        if (kod.equals("AZ")) {
            System.out.println("Azerbaijan Airlines");
        } else if (kod.equals("TK")) {
            System.out.println("Turkish Airlines");
        } else if (kod.equals("QR")) {
            System.out.println("Qatar Airways");
        } else {
            System.out.println("Naməlum aviaşirkət");
        }
        sc.close();
    }
}
