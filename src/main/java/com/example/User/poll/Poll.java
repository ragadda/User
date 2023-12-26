package com.example.User.poll;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Poll {

    @JsonProperty(value = "id")
    private Integer pollId;
    private  String title;
    private String first_answer;
    private String second_answer;
    private String third_answer;
    private String fourth_answer;

    public Poll(Integer pollId, String title, String first_answer, String second_answer, String third_answer, String fourth_answer) {
        this.pollId = pollId;
        this.title = title;
        this.first_answer = first_answer;
        this.second_answer = second_answer;
        this.third_answer = third_answer;
        this.fourth_answer = fourth_answer;
    }

    public Integer getPollId() {
        return pollId;
    }

    public void setPollId(Integer pollId) {
        this.pollId = pollId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_answer() {
        return first_answer;
    }

    public void setFirst_answer(String first_answer) {
        this.first_answer = first_answer;
    }

    public String getSecond_answer() {
        return second_answer;
    }

    public void setSecond_answer(String second_answer) {
        this.second_answer = second_answer;
    }

    public String getThird_answer() {
        return third_answer;
    }

    public void setThird_answer(String third_answer) {
        this.third_answer = third_answer;
    }

    public String getFourth_answer() {
        return fourth_answer;
    }

    public void setFourth_answer(String fourth_answer) {
        this.fourth_answer = fourth_answer;
    }



}//endclass
