package com.weiwei.brainstormingbackendserviceclient.service;

import com.weiwei.brainstormingbackendmodel.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 判题服务
 *
 * @Author weiwei
 * @Date 2023/9/4 19:44
 * @Version 1.0
 */
@FeignClient(name = "brainstorming-backend-judge-service", path = "/oj/judge/inner")
public interface JudgeFeignClient {

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    QuestionSubmit doJudge(@RequestParam("questionSubmitId") long questionSubmitId);
}
