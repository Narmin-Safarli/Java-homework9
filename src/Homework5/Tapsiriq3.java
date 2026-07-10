package Homework5;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Daxil edilən balın 0-100 aralığında olmasının yoxlanması və bala görə qiymətləri çap edirik
        System.out.print("İmtahan balını daxil edin (0-100): ");
        int imtahanBali = scanner.nextInt();

        if (imtahanBali < 0 || imtahanBali > 100) {
            System.out.println("Yanlış bal!");
        }

        else if (imtahanBali >= 90) {
            System.out.println("Əla (5)");
        }   // Bal 90 ilə 100 arasındadırsa


        else if (imtahanBali >= 80) {
            System.out.println("Çox yaxşı (4)");
        }   // Bal 80 ilə 89 arasındadırsa


        else if (imtahanBali >= 70) {
            System.out.println("Yaxşı (3)");
        }   // Bal 70 ilə 79 arasındadırsa


        else if (imtahanBali >= 60) {
            System.out.println("Kafi (2)");
        }   // Bal 60 ilə 69 arasındadırsa

        else {
            System.out.println("Qeyri-kafi (1)");
        }   // Bal 0 ilə 59 arasındadırsa

        scanner.close();
    }
}