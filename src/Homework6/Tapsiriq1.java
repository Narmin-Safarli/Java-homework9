package Homework6;

import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tələbənin balını daxil edin: ");
        int bal = sc.nextInt();

        String qiymet = "";

        if (bal >= 90) {
            qiymet = "Əla";
        } else if (bal >= 70) {
            qiymet = "Yaxşı";
        } else if (bal >= 50) {
            qiymet = "Kafi";
        } else {
            qiymet = "Qeyri-kafi";
        }
        System.out.println("Bal: " + bal + " -> Qiymət: " + qiymet);

        sc.close();
    }
}