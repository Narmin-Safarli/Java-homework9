package Homework8;

public class Tapsiriq10 {
    public static void main(String[] args) {
        int[] ballar = {45, 78, 92, 30, 65, 88};

        int minIndex = 0;

        for (int i = 1; i < ballar.length; i++) {
            if (ballar[i] < ballar[minIndex]) {
                minIndex = i;
        }

        System.out.println("Ən kiçik bal: " + ballar[minIndex]);
        System.out.println("Ən kiçik balın indeksi: " + minIndex);
    }
}