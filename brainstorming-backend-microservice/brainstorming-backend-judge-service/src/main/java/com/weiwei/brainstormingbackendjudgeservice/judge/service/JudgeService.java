package com.weiwei.brainstormingbackendjudgeservice.judge.service;

import com.weiwei.brainstormingbackendmodel.entity.QuestionSubmit;

/**
 * 判题服务接口
 *
 * @Author weiwei
 * @Date 2023/9/4 19:44
 * @Version 1.0
 */
public interface JudgeService {

    QuestionSubmit doJudge(long questionSubmitId);
}
