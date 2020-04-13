package ex2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadz liczbe. Zeby wyjsc wprowadz 'end'");
            String s = input.nextLine();
            if (!s.equals("end")) {
                try {
                    System.out.println(Integer.parseInt(s));
                } catch (NullPointerException | NumberFormatException e) {
                    e.getMessage();
                }
            } else break;
        }
    }
}
