package Homework5;

import java.util.Scanner;

public class Tapsiriq7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaşınızı daxil edin: ");
        int yas = scanner.nextInt();

        System.out.print("Aylıq gəlirinizi daxil edin: ");
        double ayliqGelir = scanner.nextDouble();

        System.out.print("Tələb olunan kredit məbləğini daxil edin: ");
        double kreditMeblegi = scanner.nextDouble();

        if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil");
        }
        else if (ayliqGelir <= 800) {
            System.out.println("Rədd edildi: gəlir kifayət deyil");
        }
        else if (kreditMeblegi < 300 || kreditMeblegi > 50000) {
            System.out.println("Rədd edildi: məbləğ uyğun deyil");
        }
        else {
            System.out.println("TƏSDİQ EDİLDİ");
        }
        scanner.close();
    }
}