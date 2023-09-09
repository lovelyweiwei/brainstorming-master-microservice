package com.weiwei.brainstormingbackendjudgeservice.judge.strategy;

import com.weiwei.brainstormingbackendmodel.codesandbox.JudgeInfo;
import com.weiwei.brainstormingbackendmodel.dto.question.JudgeCase;
import com.weiwei.brainstormingbackendmodel.entity.Question;
import com.weiwei.brainstormingbackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 *
 * @Author weiwei
 * @Date 2023/9/4 20:23
 * @Version 1.0
 */
@Data
public class JudgeContext {

    JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
