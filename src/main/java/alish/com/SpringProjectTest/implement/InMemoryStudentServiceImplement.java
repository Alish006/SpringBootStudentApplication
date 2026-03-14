package alish.com.SpringProjectTest.implement;

import alish.com.SpringProjectTest.model.Student;
import alish.com.SpringProjectTest.repository.InMemoryStudentDAO;
import alish.com.SpringProjectTest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImplement implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> getStudents() {
        return repository.getStudents();
    }

    @Override
    public void createStudent(Student student) {
        repository.createStudent(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return repository.getStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
