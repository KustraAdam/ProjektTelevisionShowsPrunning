package com.sample;

public class Answer{
    public String question;
    public String answer;

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer() {
    }

    public Answer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}