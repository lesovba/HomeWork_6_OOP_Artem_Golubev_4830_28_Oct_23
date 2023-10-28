package org.example;

import org.example.Controller.StudentController;
import org.example.Data.Student;
import org.example.Data.StudentGroup;
import org.example.Data.User;
import org.example.View.StudentView;

public class Main {
    public static void main(String[] args) {

        //Использован подход SOLID.

        StudentView studentView = new StudentView();
        StudentController<User> studentController = new StudentController<>(studentView);

        // Создание групп студентов.
        studentController.createGroup("First Group");
        studentController.createGroup("Second Group");

        // Создание студентов.
        Student student1 = new Student("Ivan", "Ivanov", 1);
        Student student2 = new Student("Jane", "Smith", 2);

        // Получение групп студентов.
        StudentGroup<User> group1 = studentController.getGroups().get(0);
        StudentGroup<User> group2 = studentController.getGroups().get(1);

        // Добавление групп студентов в другие группы.
        studentController.addStudentToGroup(group1, student1);
        studentController.addStudentToGroup(group2, student2);

        // Вывод информации
        studentController.sendGroupsOnConsole();
    }
}