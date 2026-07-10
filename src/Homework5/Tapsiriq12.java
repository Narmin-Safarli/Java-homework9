package Homework5;

import java.util.Scanner;

public class Tapsiriq12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Yaşa görə qiyməti təyin edirik

        System.out.print("Yaşınızı daxil edin: ");
        int istifadeciYasi = scanner.nextInt();

        if (istifadeciYasi < 0) {
            System.out.println("Yanlış yaş");
        }
        else if (istifadeciYasi <= 5) {
            System.out.println("Pulsuz");
        }
        else if (istifadeciYasi <= 17) {
            System.out.println("5 AZN");
        }
        else if (istifadeciYasi <= 64) {
            System.out.println("10 AZN");
        }
        else {
            System.out.println("3 AZN");
        }
        scanner.close();
    }
}