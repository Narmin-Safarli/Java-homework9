package Homework8;

public class Tapsiriq8 {
    public static void main(String[] args) {
        int[] ballar = {67, 91, 54, 88, 73};
        int max = ballar[0];
        for (int bal : ballar) {
            if (bal > max) {
                max = bal;
            }
        }

        System.out.println("Ən böyük bal: " + max);
    }
}