package com.lovelycoding.healthandglow.model.databinding;

public class QuestionAnswerDataBinding {
    private String question;
    private String questionAskedBy;
    private String questionPostedDate;
    private String answer;
    private String answeredBy;
    private String answerPostedDate;

    public QuestionAnswerDataBinding() {
    }
    public QuestionAnswerDataBinding(String question, String questionAskedBy, String questionPostedDate, String answer, String answeredBy, String answerPostedDate) {
        this.question = question;
        this.questionAskedBy = questionAskedBy;
        this.questionPostedDate = questionPostedDate;
        this.answer = answer;
        this.answeredBy = answeredBy;
        this.answerPostedDate = answerPostedDate;
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestionAskedBy() {
        return questionAskedBy;
    }

    public void setQuestionAskedBy(String questionAskedBy) {
        this.questionAskedBy = questionAskedBy;
    }

    public String getQuestionPostedDate() {
        return questionPostedDate;
    }

    public void setQuestionPostedDate(String questionPostedDate) {
        this.questionPostedDate = questionPostedDate;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnsweredBy() {
        return answeredBy;
    }

    public void setAnsweredBy(String answeredBy) {
        this.answeredBy = answeredBy;
    }

    public String getAnswerPostedDate() {
        return answerPostedDate;
    }

    public void setAnswerPostedDate(String answerPostedDate) {
        this.answerPostedDate = answerPostedDate;
    }

    @Override
    public String toString() {
        return "QuestionAnswerDataBinding{" +
                "question='" + question + '\'' +
                ", questionAskedBy='" + questionAskedBy + '\'' +
                ", questionPostedDate='" + questionPostedDate + '\'' +
                ", answer='" + answer + '\'' +
                ", answeredBy='" + answeredBy + '\'' +
                ", answerPostedDate='" + answerPostedDate + '\'' +
                '}';
    }
}
