import java.util.Scanner;

public class Tapsiriq2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       //Müqayisə edərək ən böyük və ən kiçiyini tapırıq

        System.out.print("Birinci ədədi daxil edin: ");
        int eded1 = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int eded2 = scanner.nextInt();

        System.out.print("Üçüncü ədədi daxil edin: ");
        int eded3 = scanner.nextInt();

        int enBoyuk = eded1;

        if (eded2 > enBoyuk) {
            enBoyuk = eded2;
        }

        if (eded3 > enBoyuk) {
            enBoyuk = eded3;
        }
        int enKicik = eded1;

        if (eded2 < enKicik) {
            enKicik = eded2;
        }
        if (eded3 < enKicik) {
            enKicik = eded3;
        }

        System.out.println("Ən böyük: " + enBoyuk);
        System.out.println("Ən kiçik: " + enKicik);

        scanner.close();
    }
}