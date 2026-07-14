package Homework7;

import java.util.Scanner;

public class Tapsiriq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperaturu daxil et: ");
        int temp = scanner.nextInt();

        String status;
        if (temp > 25) status = "İsti";
        else if (temp >= 15) status = "Mülayim";
        else if (temp >= 0) status = "Soyuq";
        else status = "Şaxta";


        System.out.println("Temperatur: " + temp + "°C → Status: " + status);

        scanner.close();
    }
}
