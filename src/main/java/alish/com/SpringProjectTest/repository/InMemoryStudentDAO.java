package alish.com.SpringProjectTest.repository;

import alish.com.SpringProjectTest.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> Students = new ArrayList<>();

    public List<Student> getStudents() {
        return Students;
    }

    public void createStudent(Student student) {
        Students.add(student);
    }

    public Student getStudentByEmail(String email) {
        return Students.stream()
                .filter(el -> el.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, Students.size())
                .filter(idx -> Students.get(idx).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);

        if (studentIndex > -1) {
            Students.set(studentIndex, student);
            return student;
        }
        return null;
    }

    public void deleteStudent(String email) {
        var student = getStudentByEmail(email);

        if (student != null) {
            Students.remove(student);
        }

    }

}
