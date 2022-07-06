package service;

import entity.Lesson;
import entity.Paye;
import entity.Student;
import entity.Teacher;
import repo.LessonRepository;
import repo.PayeRepository;
import repo.StudentRepository;
import repo.TeacherRepository;

public class ManagerService {

    private StudentRepository studentRepository = new StudentRepository();
    private LessonRepository lessonRepository = new LessonRepository();
    private TeacherRepository teacherRepository = new TeacherRepository();
    private PayeRepository payeRepository = new PayeRepository();

    public void addStudent(Student student) {
        studentRepository.addstudent(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteStudent(id);
    }

    public void addLesson(Lesson lesson){
        lessonRepository.addLesson(lesson);
    }

    public void deleteLesson(Long id){
        lessonRepository.deleteLesson(id);
    }

    public void addTeacher(Teacher teacher){
        teacherRepository.addTeacher(teacher);
    }

    public void deleteTeacher(Long id){
        teacherRepository.deleteTeacher(id);
    }

    public void createPaye(Paye paye){
        payeRepository.addPaye(paye);
    }

    public void deletePaye(Long id){
        payeRepository.deletePaye(id);
    }

}
