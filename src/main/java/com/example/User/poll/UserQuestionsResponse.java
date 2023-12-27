package com.example.User.poll;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserQuestionsResponse {


    @JsonProperty(value = "user_id")
    private Integer userId;
    @JsonProperty(value = "question_id")
    private Integer questionId;

    private String answer;

    public UserQuestionsResponse(Integer userId, Integer questionId, String answer) {
        this.userId = userId;
        this.questionId = questionId;
        this.answer = answer;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}//end class
