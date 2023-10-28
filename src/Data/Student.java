package org.example.Data;

// Путь упаковки файлов.
// Создаём Student, наследующегося от типа User.
public class Student extends User
{
    // Установление полей для класса Student.
    private int studentId;

    // Создание конструктора, который наследует значение полей класса User и передаёт поле класса Student, внутри конструктора происходит инициализация полей для передачи значений объекта.
    public Student(String firstName, String secondName, int studentId) {
        super(firstName, secondName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Создание консольной строки toString для вывода в консоль.
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + "studentId=" + studentId + "]";
    }
}