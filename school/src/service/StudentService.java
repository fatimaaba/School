package service;

import entity.Lesson;
import repo.LessonRepository;
import repo.ScoreRepository;
import repo.StudentRepository;

public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();
    private LessonRepository lessonRepository = new LessonRepository();
    private ScoreRepository scoreRepository = new ScoreRepository();

    public void addLesson(Lesson lesson){
      lessonRepository.addLesson(lesson);
    }

    public void getScores(){
        scoreRepository.selectAllScores();
    }


}
