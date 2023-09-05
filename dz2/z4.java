package dz2;

import java.util.Scanner;

public class z4 {

    public static class EmptyStringException extends Exception {
        public EmptyStringException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (true) {
            System.out.print("Введите строку: ");
            input = scanner.nextLine();

            try {
                if (input.trim().isEmpty()) {
                    throw new EmptyStringException("Пустые строки вводить нельзя!");
                }
                System.out.println("Вы ввели: " + input);
                break; // выходим из цикла
            } catch (EmptyStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
