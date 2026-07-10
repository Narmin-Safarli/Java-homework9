package Homework5;

import java.util.Scanner;

public class Tapsiriq11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //switch-də char tipli böyük və kiçik saitləri break yazmadan qruplaşdırırıq

        System.out.print("Bir hərf daxil edin: ");
        char daxilEdilenHerf = scanner.next().charAt(0);

        switch (daxilEdilenHerf) {
            // Kiçik saitlər
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                // Böyük saitlər
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Sait");
                break;

            default:
                // Sait olmayan bütün digər hallar
                System.out.println("Samit");
                break;
        }
        scanner.close();
    }
}