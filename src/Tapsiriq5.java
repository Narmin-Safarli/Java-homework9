import java.util.Scanner;

public class Tapsiriq5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Gün nömrəsini daxil edin (1-7): ");
        int gunNomresi = scanner.nextInt();

        // Switch strukturu ilə günlərin yoxlanılması

        switch (gunNomresi) {
            case 1:
                System.out.println("Bazar ertəsi");
                break;
            case 2:
                System.out.println("Çərşənbə axşamı");
                break;
            case 3:
                System.out.println("Çərşənbə");
                break;
            case 4:
                System.out.println("Cümə axşamı");
                break;
            case 5:
                System.out.println("Cümə");
                break;
            case 6:
                System.out.println("Şənbə");

            case 7:
                System.out.println("Bazar");
                System.out.println("Həftə sonu!");
                break;
            default:
                System.out.println("Yanlış gün nömrəsi");
                break;
        }
        scanner.close();
    }
}