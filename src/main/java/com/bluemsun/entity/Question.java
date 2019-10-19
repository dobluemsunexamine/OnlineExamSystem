package com.bluemsun.entity;

public class Question {
    private Integer type;
    private Integer questionId;
    private Integer homeworkId;
    private Text Describe;
    private Integer score;

    public Text getDescribe() {
        return Describe;
    }

    public void setDescribe(Text describe) {
        Describe = describe;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}