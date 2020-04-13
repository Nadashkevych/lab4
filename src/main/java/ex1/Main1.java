package ex1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[] array = createStringsArray();
        elementFromStringsArray(array);
    }

    private static void elementFromStringsArray(String[] array) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Ktory element chcesz wyswietlic?");
            int nr = input.nextInt() - 1;
            System.out.println(array[nr]);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    private static String[] createStringsArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ile elementow bedzie zawierac tablica?");
        String[] array = new String[input.nextInt()];
        input.nextLine();
        System.out.println("Wpisz elementy tablicy");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextLine();
        }
        return array;
    }
}
