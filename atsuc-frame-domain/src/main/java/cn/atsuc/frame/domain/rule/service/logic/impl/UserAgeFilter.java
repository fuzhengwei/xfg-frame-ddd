package cn.atsuc.frame.domain.rule.service.logic.impl;


import cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.atsuc.frame.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 年龄规则
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterEntity decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }

}
