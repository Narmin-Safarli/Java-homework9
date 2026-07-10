package Homework6;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxQol = -1;
        int enYaxsiOyuncu = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "-oyunçunun vurduğu qol sayını daxil edin: ");
            int qol = sc.nextInt();

            if (qol > maxQol) {
                maxQol = qol;
                enYaxsiOyuncu = i;
            }
        }

        System.out.println("-Nəticə-");
        System.out.println("Ən çox qol vuran oyunçunun nömrəsi: " + enYaxsiOyuncu);
        System.out.println("Vurduğu qol sayı: " + maxQol);
        sc.close();
    }
}