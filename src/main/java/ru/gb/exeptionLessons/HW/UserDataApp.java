package ru.gb.exeptionLessons.HW;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите через пробел: Фамилия Имя Отчество, Дата Рождения: в формате dd.mm.yyyy, Номер телефона:целое беззнаковое число без форматирования, Пол: символ латиницей f или m.:");
        String input = scanner.nextLine();

        try {
            UserData userData = parseUserData(input);
            saveToFile(userData);
            System.out.println("Данные успешно сохранены в файл.");
        } catch (RuntimeException | ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static UserData parseUserData(String input) throws RuntimeException, ParseException {
        String[] data = input.split("\\s+");
        if (data.length != 6) {
            throw new RuntimeException("Неверное количество параметров. Ожидается 6 параметров.");
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        Date birthDate = parseDate(data[3]);
        String phoneNumber = data[4];
        char gender = parseGender(data[5]);

        return new UserData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
    }

    private static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        return dateFormat.parse(dateString);
    }

    private static char parseGender(String genderString) {
        if (genderString.equalsIgnoreCase("m")) {
            return 'M';
        } else if (genderString.equalsIgnoreCase("f")) {
            return 'F';
        } else {
            throw new IllegalArgumentException("Неверное значение пола. Введите  'm' или 'f'.");
        }
    }

    private static void saveToFile(UserData userData) throws IOException {
        String fileName = userData.lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(userData.toString());
            writer.newLine();
        }
    }
}
