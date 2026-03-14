package alish.com.SpringProjectTest.controller;

import alish.com.SpringProjectTest.model.Student;
import alish.com.SpringProjectTest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private StudentService service;

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping("create-student")
    public String createStudent(@RequestBody Student student) {
        service.createStudent(student);
        return "Student successfully created !";
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return service.getStudentByEmail(email);
    }

    @PutMapping("update-student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete-student/{email}")
    public String deleteStudent( @PathVariable String email) {
        service.deleteStudent(email);
        return "Student successfully deleted !";
    }

}
