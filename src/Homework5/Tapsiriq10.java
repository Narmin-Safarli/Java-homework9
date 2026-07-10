package Homework5;

import java.util.Scanner;

public class Tapsiriq10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- BANK MENYUSU ---");
        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");

        System.out.print("Zəhmət olmasa etmək istədiyiniz əməliyyatı seçin (1-4): ");
        int istifadeciSecimi = scanner.nextInt();

        // 3. Switch-case ilə seçilən əməliyyata uyğun mesajın verilməsi
        switch (istifadeciSecimi) {
            case 1:
                System.out.println("Balansınız: 1250 AZN");
                break;

            case 2:
                System.out.println("Pul uğurla balansınıza yatırıldı.");
                break;

            case 3:
                System.out.println("Məbləğ nağdlaşdırıldı. Zəhmət olmasa pulunuzu götürün.");
                break;

            case 4:
                System.out.println("Sistemdən çıxış edilir. Sağlam qalın!");
                break;

            default:
                System.out.println("Yanlış seçim");
                break;
        }
        scanner.close();
    }
}