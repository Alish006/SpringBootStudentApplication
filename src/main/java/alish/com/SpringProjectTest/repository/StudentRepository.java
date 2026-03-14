package alish.com.SpringProjectTest.repository;

import alish.com.SpringProjectTest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findStudentByEmail(String email);
    void deleteStudentByEmail(String email);

}
