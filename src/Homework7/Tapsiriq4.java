package Homework7;

import java.util.Scanner;

public class Tapsiriq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enAzVaxt = 999999;
        int enSuretliQacisciNo = 0;

        for (int i=1; i<= 3; i++) {
            System.out.println(i+ "-ci qaçışçının vaxtı: ");
            int vaxt = sc.nextInt();
            if (vaxt == enAzVaxt) {
                enSuretliQacisciNo = i;

                System.out.println("Ən sürətli qaçışçı: " + enSuretliQacisciNo);
                System.out.println("Vaxtı: " + enAzVaxt + "saniyə");
            }
        } sc.close();
    }


}
