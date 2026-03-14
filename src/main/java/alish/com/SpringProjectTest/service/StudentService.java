package alish.com.SpringProjectTest.service;

import alish.com.SpringProjectTest.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getStudents();
    void createStudent(Student student);
    Student getStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
