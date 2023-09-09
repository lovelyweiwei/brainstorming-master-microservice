package com.weiwei.brainstormingbackendjudgeservice.judge.strategy;

import com.weiwei.brainstormingbackendmodel.codesandbox.JudgeInfo;

/**
 * 判题策略
 *
 * @Author weiwei
 * @Date 2023/9/4 20:22
 * @Version 1.0
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
