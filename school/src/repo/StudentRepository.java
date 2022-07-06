package repo;

import entity.Lesson;
import entity.Score;
import entity.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRepository {

    private List<Student> students = new LinkedList<>();

    private Long nextId = 0L;

    public void addstudent(Student student){
        student.setId(nextId++);
        students.add(student);

    }

    public void deleteStudent(Long id){
        students = students.stream().filter(student -> !student.getId().equals(id)).collect(Collectors.toList());
    }

    public void updateStudent(Student student){
        var studentInDb = students
                .stream()
                .filter(student1 -> student1.getId().equals(student))
                .findFirst();

        if(studentInDb.isEmpty()){
            return;
        }

        studentInDb.get().setFirstName(student.getFirstName());
        studentInDb.get().setLastName(student.getLastName());
    }

}
