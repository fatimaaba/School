package repo;


import entity.Teacher;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherRepository {

    private List<Teacher> teachers = new LinkedList<>();
    private Long nextId = 0L;

    public void addTeacher(Teacher teacher){
        teacher.setId(nextId++);
        teachers.add(teacher);
    }

    public void deleteTeacher(Long id){
        teachers = teachers.stream().filter(lesson -> !lesson.getId().equals(id)).collect(Collectors.toList());
    }

    public void updateTeacher(Teacher teacher){
        var teacherInDb = teachers
                .stream()
                .filter(lesson1 -> lesson1.getId().equals(teacher))
                .findFirst();
        if(teacherInDb.isEmpty()){
            return;
        }

        teacherInDb.get().setName(teacher.getName());
        teacherInDb.get().setLastName(teacher.getLastName());
    }

    public List<Teacher> findAll(){
        for (Teacher teacher : teachers) {
            System.out.println("List of teacher is : " + teacher);
        }
        return teachers;
    }





}
