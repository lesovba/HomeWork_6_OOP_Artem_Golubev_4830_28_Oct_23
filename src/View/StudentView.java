package org.example.View;

import org.example.Data.Student;
import org.example.Data.StudentGroup;
import org.example.Data.User;

import java.util.List;
import java.util.logging.Logger;


public class StudentView implements UserView<User> {
    Logger logger = Logger.getLogger(StudentView.class.getName());

    // Вывод информации по определённому студенту из группы.
    @Override
    public void sendOnConsole(List<StudentGroup<User>> groups) {
        // В цикле проходим по каждой группе студентов.
        for(StudentGroup<User> group: groups) {
            // Проходим по каждому студенту в группе студентов.
            for(User student: group.getStudents()) {
                // Выводим информацию о студенте.
                logger.info(student.toString());
            }
        }
    }

    // Вывод группы студентов.
    @Override
    public void sendOnConsoleUserGroup(StudentGroup<User> studentGroup) {
        logger.info(studentGroup.toString());
    }

    // Вывод списка студентов.
    @Override
    public void sendOnConsoleListStudent(List<Student> students) {
        logger.info(students.toString());
    }
}