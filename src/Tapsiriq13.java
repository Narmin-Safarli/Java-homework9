import java.util.Scanner;

    public class Tapsiriq13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Çəkini daxil edin: ");
        double caki = scanner.nextDouble();

        System.out.print("Boyu daxil edin: ");
        double boy = scanner.nextDouble();

        double bmi = caki / (boy * boy);
        System.out.printf("Sizin BMI nəticəniz: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kateqoriya: Arıq");
        } else if (bmi >= 18.5 && bmi <= 24.9) {

            System.out.println("Kateqoriya: Normal");
        } else if (bmi >= 25.0 && bmi <= 29.9) {

            System.out.println("Kateqoriya: Artıq çəkili");
        } else { // 30 və yuxarı

            System.out.println("Kateqoriya: Piylənmə");
        }

        scanner.close();
    }
}