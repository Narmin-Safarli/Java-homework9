package Homework8;

public class Tapsiriq9 {
    public static void main(String[] args) {
        int[] massiv = new int[8];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = (i + 1) * 10;
        }

        for (int element : massiv) {
            System.out.print(element + " ");
        }
    }
}