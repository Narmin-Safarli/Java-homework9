package Homework6;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İlkin balansı daxil edin: ");
        double balans = sc.nextDouble();

        double emeliyyat = -1;

        while (emeliyyat != 0) {
            System.out.print("Əməliyyat məbləğini daxil edin (Mədaxil üçün müsbət, məxaric üçün mənfi, dayanmaq üçün 0): ");
            emeliyyat = sc.nextDouble();

            if (emeliyyat == 0) {
                break;
            }

            balans += emeliyyat;

            System.out.println("Yeni balansınız: " + balans);

            if (balans < 0) {
                System.out.println("DİQQƏT: Balansınız mənfiyə düşdü! Xəbərdarlıq!");
            }
            System.out.println(" ");
        }

        System.out.println("Proqram bitdi. Son balans: " + balans);
        sc.close();
    }
}