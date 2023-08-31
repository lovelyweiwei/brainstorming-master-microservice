package com.weiwei.brainstorming.model.dto.question;

import lombok.Data;

/**
 * 题目配置
 *
 * @Author weiwei
 * @Date 2023/8/31 19:58
 * @Version 1.0
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制 (ms)
     */
    private Long timeLimit;

    /**
     * 内存限制 (KB)
     */
    private Long memoryLimit;

    /**
     * 堆栈限制 (KB)
     */
    private Long stackLimit;
}
