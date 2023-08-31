package com.weiwei.brainstorming.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.weiwei.brainstorming.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.weiwei.brainstorming.model.entity.QuestionSubmit;
import com.weiwei.brainstorming.model.entity.User;

/**
 * @author Administrator
 * @description 针对表【question_submit(题目提交)】的数据库操作Service
 * @createDate 2023-08-31 18:27:23
 */
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);
}
