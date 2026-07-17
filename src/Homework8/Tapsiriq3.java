package Homework8;

import java.util.Scanner;

public class Tapsiriq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int eded;

        do {
            System.out.println("Ədəd daxil edin:");
            eded = sc.nextInt();

            if (eded <= 0) {
                System.out.println("Yenidən daxil edin: ");
            }

        } while (eded <= 0);

        System.out.println("Qəbul edildi: " + eded);

        sc.close();
    }
}