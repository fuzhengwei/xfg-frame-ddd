package cn.atsuc.frame.domain.rule.service.logic.impl;


import cn.atsuc.frame.domain.rule.model.entity.DecisionMatterEntity;
import cn.atsuc.frame.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 性别规则
 */
@Component
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterEntity decisionMatter) {
        return decisionMatter.getValMap().get("gender").toString();
    }
    
}
