package com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox;

import com.weiwei.brainstormingbackendmodel.codesandbox.ExecuteCodeRequest;
import com.weiwei.brainstormingbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * @Author weiwei
 * @Date 2023/9/4 18:13
 * @Version 1.0
 */
public interface CodeSandBox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
