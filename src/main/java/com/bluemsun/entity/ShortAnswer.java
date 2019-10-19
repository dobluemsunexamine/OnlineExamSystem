package com.bluemsun.entity;

public class ShortAnswer {
    private Question question;
    private String AnswerFile;

    public String getAnswerFile() {
        return AnswerFile;
    }

    public void setAnswerFile(String answerFile) {
        AnswerFile = answerFile;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
