package com.weiwei.brainstorming.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.weiwei.brainstorming.model.entity.Question;
import com.weiwei.brainstorming.service.QuestionService;
import com.weiwei.brainstorming.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2023-08-31 18:26:25
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService {

}




