package org.example.Data;

import java.util.Comparator;

class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T User1, T User2) {
        // Проверяем Фамилию.
        int resultOfComparing = User1.getSecondName().compareTo(User2.getSecondName());
        // Если Фамилии одинаковые, делаем проверку по именам.
        if (resultOfComparing == 0) {
            // Сравниваем имя.
            resultOfComparing = User1.getFirstName().compareTo(User2.getFirstName());
            // // Если Имена одинаковые, делаем дополнительное сравнение по Отчеству.
            if (resultOfComparing == 0) {
                return User1.getPatronymic().compareTo(User2.getPatronymic());
            }
        }
        return resultOfComparing;
    }
}