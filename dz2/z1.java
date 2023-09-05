package dz2;

import java.util.Scanner;

public class z1 {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите дробное число: ");
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Это не дробное число. Пожалуйста, попробуйте еще раз.");
            }
        }
    }

    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели: " + userInput);
    }
}
