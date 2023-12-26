package com.example.User.poll;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(
        name = "pollServices",
        url = "${answer.url}"
)
public interface AnswerService {
    @DeleteMapping(path = "/delete_all_answers")
    public void deleteAllUserAnswers(@RequestParam Integer userId);

}//end class
