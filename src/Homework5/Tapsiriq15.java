package Homework5;

import java.util.Scanner;

public class Tapsiriq15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //length() ilə parolun uzunluğunu yoxlayırıq və riskini yoxlayırıq

        System.out.print("Parolu daxil edin: ");
        String parol = scanner.nextLine();


        int uzunluq = parol.length();


        if (uzunluq == 0) {
            System.out.println("Parol boş ola bilməz");
        } else if (uzunluq < 6) {
            System.out.println("Zəif");
        } else if (uzunluq >= 6 && uzunluq <= 9) {
            System.out.println("Orta");
        } else {
            System.out.println("Güclü");
        }

        scanner.close();
    }
}