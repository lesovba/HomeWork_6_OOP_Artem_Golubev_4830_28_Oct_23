package org.example.View;

import java.util.List;

import org.example.Data.Student;
import org.example.Data.StudentGroup;
import org.example.Data.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<StudentGroup<T>> groups);
    void sendOnConsoleUserGroup(StudentGroup<T> studentGroup);
    void sendOnConsoleListStudent(List<Student> students);
}