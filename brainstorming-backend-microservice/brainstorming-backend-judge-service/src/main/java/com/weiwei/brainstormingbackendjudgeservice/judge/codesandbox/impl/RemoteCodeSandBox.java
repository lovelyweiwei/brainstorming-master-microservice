package com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.weiwei.brainstormingbackendcommon.common.ErrorCode;
import com.weiwei.brainstormingbackendcommon.exception.BusinessException;
import com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.weiwei.brainstormingbackendmodel.codesandbox.ExecuteCodeRequest;
import com.weiwei.brainstormingbackendmodel.codesandbox.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * 远程代码沙箱（主要实现的）
 *
 * @Author weiwei
 * @Date 2023/9/4 18:58
 * @Version 1.0
 */
public class RemoteCodeSandBox implements CodeSandBox {
    // 定义鉴权请求头和密钥
    public static final String AUTH_REQUEST_HEADER = "auth";
    public static final String AUTH_REQUEST_SECRET = "secretKey";

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://localhost:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .body(json)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
