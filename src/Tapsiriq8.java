import java.util.Scanner;

public class Tapsiriq8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a tərəfinin uzunluğunu daxil edin: ");
        double tarafA = scanner.nextDouble();

        System.out.print("b tərəfinin uzunluğunu daxil edin: ");
        double tarafB = scanner.nextDouble();

        System.out.print("c tərəfinin uzunluğunu daxil edin: ");
        double tarafC = scanner.nextDouble();

        if ((tarafA < tarafB + tarafC) && (tarafB < tarafA + tarafC) && (tarafC < tarafA + tarafB)) {

            if (tarafA == tarafB && tarafB == tarafC) {
                System.out.println("Bərabərtərəfli");
            }
            else if (tarafA == tarafB || tarafB == tarafC || tarafA == tarafC) {
                System.out.println("Bərabəryanlı");
            }
            else {
                System.out.println("Müxtəliftərəfli");
            }

        } else {
            System.out.println("Belə üçbucaq mövcud deyil");
        }
        scanner.close();
    }
}