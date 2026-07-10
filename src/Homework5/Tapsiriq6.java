package Homework5;

import java.util.Scanner;

public class Tapsiriq6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Switch ilə işarəyə uyğun hesablama aparırıq

        System.out.print("Birinci ədədi daxil edin: ");
        double eded1 = scanner.nextDouble();

        System.out.print("İkinci ədədi daxil edin: ");
        double eded2 = scanner.nextDouble();


        System.out.print("Əməliyyatı daxil edin (+, -, *, /): ");
        String emeliyyatIsaresi = scanner.next();

        switch (emeliyyatIsaresi) {
            case "+":
                System.out.println("Nəticə: " + (eded1 + eded2));
                break;

            case "-":
                System.out.println("Nəticə: " + (eded1 - eded2));
                break;

            case "*":
                System.out.println("Nəticə: " + (eded1 * eded2));
                break;

            case "/":
                // Bölmə zamanı ikinci ədədin 0 olub-olmaması yoxlanılması
                if (eded2 == 0) {
                    System.out.println("0-a bölmək olmaz!");
                } else {
                    System.out.println("Nəticə: " + (eded1 / eded2));
                }
                break;

            default:
                System.out.println("Xəta: Yanlış əməliyyat işarəsi daxil edilib!");
                break;
        }

        scanner.close();
    }
}