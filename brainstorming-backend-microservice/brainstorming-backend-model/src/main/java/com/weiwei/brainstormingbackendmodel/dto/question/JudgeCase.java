package com.weiwei.brainstormingbackendmodel.dto.question;

import lombok.Data;

/**
 * 题目用例
 *
 * @Author weiwei
 * @Date 2023/8/31 19:58
 * @Version 1.0
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
