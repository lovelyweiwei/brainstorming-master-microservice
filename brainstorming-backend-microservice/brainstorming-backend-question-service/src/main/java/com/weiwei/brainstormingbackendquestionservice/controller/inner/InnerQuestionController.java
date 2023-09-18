package com.weiwei.brainstormingbackendquestionservice.controller.inner;

import com.weiwei.brainstormingbackendmodel.entity.Question;
import com.weiwei.brainstormingbackendmodel.entity.QuestionSubmit;
import com.weiwei.brainstormingbackendquestionservice.service.QuestionService;
import com.weiwei.brainstormingbackendquestionservice.service.QuestionSubmitService;
import com.weiwei.brainstormingbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.attribute.HashPrintRequestAttributeSet;

/**
 * 该服务仅内部调用
 *
 * @Author weiwei
 * @Date 2023/9/9 13:44
 * @Version 1.0
 */
@RestController
@RequestMapping("/inner")
public class InnerQuestionController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Override
    @GetMapping("/get/id")
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @Override
    @GetMapping("/question_submit/get/id")
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @Override
    @PostMapping("/question_submit/update")
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }

}
