package com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox;

import com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandBox;
import com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandBox;
import com.weiwei.brainstormingbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandBox;

/**
 * 代码沙箱工厂（根据字符串参数创建指定的代码沙箱实例）
 *
 * @Author weiwei
 * @Date 2023/9/4 19:11
 * @Version 1.0
 */
public class CodeSandBoxFactory {

    // 静态工厂模式
    public static CodeSandBox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandBox();
            case "remote":
                return new RemoteCodeSandBox();
            case "thirdParty":
                return new ThirdPartyCodeSandBox();
            default:
                return new ExampleCodeSandBox();
        }
    }

}
