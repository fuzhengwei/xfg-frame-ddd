package cn.bugstack.xfg.frame.domain.rule.service.logic.impl;

import cn.bugstack.xfg.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.bugstack.xfg.frame.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 性别规则
 * @author: 小傅哥，微信：fustack
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterEntity decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
    
}
