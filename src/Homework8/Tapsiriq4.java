package Homework8;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cem = 0;
        int eded;

        do {
            System.out.print("Ədəd daxil edin: ");
            eded = sc.nextInt();

            if (eded != 0) {
                cem += eded;
            }

        } while (eded!= 0);

        System.out.println("Cəm: " + cem);
        sc.close();
    }
}