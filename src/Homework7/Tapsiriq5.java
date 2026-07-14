package Homework7;

import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qiymet = 1000.0;
        double hedefQiymet = 2000.0;
        int il = 0;

        while (qiymet < hedefQiymet) {
            il++;
            qiymet = qiymet * 1.08;
            System.out.println("İl " + il + ": " + qiymet + " AZN");
        } sc.close();
    }
}
