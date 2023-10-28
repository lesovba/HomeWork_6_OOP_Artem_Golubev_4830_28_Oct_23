package org.example.Data;

public class User {
    // Установление полей для класса User.
    protected String firstName;
    protected String secondName;

    // Создание конструктора, который принимает значение полей класса User, внутри конструктора происходит инициализация полей для передачи значений объекта.
    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    // Создание консольной строки toString для вывода в консоль.
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + "]";
    }

}