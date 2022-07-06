package repo;

import entity.Score;

import java.util.LinkedList;
import java.util.List;

public class ScoreRepository {

    private List<Score> scores = new LinkedList<>();
    private Long nextId = 0L;

    public void addScore(Score score) {
        score.setId(nextId++);
        scores.add(score);
    }

    public List<Score> selectAllScores() {
        for (Score score : scores) {
            System.out.printf("first Score is : " + score);
        }
        return scores;
    }
}
