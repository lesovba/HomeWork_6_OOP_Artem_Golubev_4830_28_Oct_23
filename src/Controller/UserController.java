package org.example.Controller;

import java.util.List;

import org.example.Data.StudentGroup;
import org.example.Data.User;

// Создаём типизированный UserController, наследующегося от типа User.
public interface UserController<T extends User> {

    // Установление полей для класса UserController.
    void createGroup(String groupName);
    void addStudentToGroup(StudentGroup<T> group, T student);
    void removeStudentFromGroup(StudentGroup<T> group, T student);
    List<StudentGroup<T>> getGroups();
}