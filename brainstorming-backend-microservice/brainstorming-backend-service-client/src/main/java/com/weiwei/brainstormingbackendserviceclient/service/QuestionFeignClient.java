package com.weiwei.brainstormingbackendserviceclient.service;

import com.weiwei.brainstormingbackendmodel.entity.Question;
import com.weiwei.brainstormingbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 问题服务
 *
 * @author Administrator
 * @description 针对表【question(题目)】的数据库操作Service
 * @createDate 2023-08-31 18:26:25
 */
@FeignClient(name = "brainstorming-backend-question-service", path = "/oj/question/inner")
public interface QuestionFeignClient {
    @GetMapping("/get/id")
    Question getQuestionById(@RequestParam("questionId") long questionId);

    @GetMapping("/question_submit/get/id")
    QuestionSubmit getQuestionSubmitById(@RequestParam("questionId") long questionSubmitId);

    @PostMapping("/question_submit/update")
    boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit);
}
