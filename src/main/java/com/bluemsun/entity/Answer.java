package com.bluemsun.entity;

public class Answer {
private Integer studentId;
private Integer QuestionId;
private Integer StudentAnswer;
private Text ShortAnswer;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(Integer questionId) {
        QuestionId = questionId;
    }

    public Integer getStudentAnswer() {
        return StudentAnswer;
    }

    public void setStudentAnswer(Integer studentAnswer) {
        StudentAnswer = studentAnswer;
    }

    public Text getShortAnswer() {
        return ShortAnswer;
    }

    public void setShortAnswer(Text shortAnswer) {
        ShortAnswer = shortAnswer;
    }
}
