package repo;

import entity.Lesson;
import entity.Manager;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LessonRepository {

    private List<Lesson> lessons = new LinkedList<>();


    private Long nextId = 0L;


    public void addLesson(Lesson lesson){
        lesson.setId(nextId++);
        lessons.add(lesson);
    }

    public void deleteLesson(Long id){
        lessons = lessons.stream().filter(lesson -> !lesson.getId().equals(id)).collect(Collectors.toList());
    }

    public List<Lesson> findAll(){

        for (Lesson lesson : lessons) {
            System.out.printf("List of Lessons : " + lesson);
        }
        return lessons;
    }
}
