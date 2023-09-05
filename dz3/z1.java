package dz3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.PrintWriter;

public class z1 {
    
    public static class UserDataApp {
        
        public static void getInputAndWriteToFile() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные (Фамилия Имя Отчество Дата рождения Номер телефона пол):");
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            if (parts.length != 6) {
                System.out.println("Введено " + parts.length + " параметров. Требуется 6.");
                return;
            }

            try {
                String surname = parts[0];
                String name = parts[1];
                String patronymic = parts[2];
                validateDate(parts[3]);
                validatePhone(parts[4]);
                validateGender(parts[5]);

                // Запись в файл
                try (PrintWriter out = new PrintWriter(new FileWriter(surname + ".txt", true))) {
                    out.println("<" + surname + "><" + name + "><" + patronymic + "><" + parts[3] + "> <" + parts[4] + "><" + parts[5] + ">");

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private static void validateDate(String date) throws Exception {
            if (!Pattern.matches("\\d{2}\\.\\d{2}\\.\\d{4}", date)) {
                throw new Exception("Неверный формат даты. Требуется dd.mm.yyyy");
            }
        }

        private static void validatePhone(String phone) throws Exception {
            try {
                Long.parseLong(phone);
            } catch (NumberFormatException e) {
                throw new Exception("Номер телефона должен быть числом.");
            }
        }

        private static void validateGender(String gender) throws Exception {
            if (!gender.equals("f") && !gender.equals("m")) {
                throw new Exception("Пол должен быть 'f' или 'm'.");
            }
        }
    }

    public static void main(String[] args) {
        UserDataApp.getInputAndWriteToFile();
    }
}
