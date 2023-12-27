package com.example.User.poll;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(
        name = "pollServices",
        url = "${poll.url}"
)
public interface PollService {
    @GetMapping(path = "/poll/user_answers")
    List<UserQuestionsResponse> getUserAnswer(@RequestParam(value = "user_id") Integer userId);

    @DeleteMapping(path = "/answer/delete_all_answers")
    void deleteAllUserAnswers(@RequestParam(value = "user_id") Integer userId);
}//endclass
