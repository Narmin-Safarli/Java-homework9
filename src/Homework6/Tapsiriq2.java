package Homework6;

import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cem = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "-ci tələbənin balını daxil edin: ");
            int bal = sc.nextInt();

            cem += bal;
        }
        double ortaBal = (double) cem / 10;

        System.out.println("\n--- Nəticə ---");
        System.out.println("Balların cəmi: " + cem);
        System.out.println("Sinifin orta balı: " + ortaBal);

        if (ortaBal > 70) {
            System.out.println("Sinif uğurludur");
        } else {
            System.out.println("Əlavə işə ehtiyac var");
        }
        sc.close();
    }
}