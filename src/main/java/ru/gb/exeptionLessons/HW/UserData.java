package ru.gb.exeptionLessons.HW;
import java.text.SimpleDateFormat;
import java.util.Date;

class UserData {
    String lastName;
    String firstName;
    String middleName;
    Date birthDate;
    String phoneNumber;
    char gender;

    UserData(String lastName, String firstName, String middleName, Date birthDate, String phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return lastName + " " + firstName + " " + middleName + " " +
                dateFormat.format(birthDate) + " " + phoneNumber + " " + gender;
    }
}

