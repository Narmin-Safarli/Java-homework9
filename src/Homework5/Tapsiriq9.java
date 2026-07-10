package Homework5;

import java.util.Scanner;

public class Tapsiriq9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //switch-də break yazmadan ayları fəsillərə görə qruplaşdırıb fall-through istifadə edirik

        System.out.print("Ay nömrəsini daxil edin (1-12): ");
        int ayNomresi = scanner.nextInt();

        switch (ayNomresi) {
            // Qış ayları
            case 12:
            case 1:
            case 2:
                System.out.println("Qış");
                break;

            // Yaz ayları
            case 3:
            case 4:
            case 5:
                System.out.println("Yaz");
                break;

            // Yay ayları
            case 6:
            case 7:
            case 8:
                System.out.println("Yay");
                break;

            // Payız ayları
            case 9:
            case 10:
            case 11:
                System.out.println("Payız");
                break;

            // 1-12 aralığına düşməyən bütün yanlış hallar üçün
            default:
                System.out.println("Yanlış ay nömrəsi");
                break;
        }
        scanner.close();
    }
}