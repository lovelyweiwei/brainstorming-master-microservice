package com.weiwei.brainstorming.judge;

import com.weiwei.brainstorming.model.entity.QuestionSubmit;
import com.weiwei.brainstorming.model.vo.QuestionSubmitVO;

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
