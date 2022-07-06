package service;

import entity.Score;
import repo.ScoreRepository;

public class TeacherService {

    private ScoreRepository scoreRepository = new ScoreRepository();

    public void addScore(Score score){
        scoreRepository.addScore(score);
    }

}
