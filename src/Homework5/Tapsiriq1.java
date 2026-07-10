package Homework5;

import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ədədin cüt və ya tək olmasını qalıq operatoru (%) ilə yoxlayırıq.

        System.out.print("Bir tam ədəd daxil edin: ");
        int eded = scanner.nextInt();

        if (eded % 2 == 0) {
            System.out.println("Ədəd cütdür.");
        } else {
            System.out.println("Ədəd təkdir.");
        }

        //Sırıla müqayisə edərək mənfi və ya müsbət olduğunu tapırıq.

        if (eded > 0) {
            System.out.println("Ədəd müsbətdir.");
        } else if (eded < 0) {
            System.out.println("Ədəd mənfidir.");
        } else {
            System.out.println("Ədəd sıfırdır.");
        }

        scanner.close();
    }
}