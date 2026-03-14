package alish.com.SpringProjectTest.implement;

import alish.com.SpringProjectTest.model.Student;
import alish.com.SpringProjectTest.repository.StudentRepository;
import alish.com.SpringProjectTest.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImplement implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        studentRepository.deleteStudentByEmail(email);
    }
}
