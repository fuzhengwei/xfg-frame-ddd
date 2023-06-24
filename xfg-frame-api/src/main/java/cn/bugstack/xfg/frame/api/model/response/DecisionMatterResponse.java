package cn.bugstack.xfg.frame.api.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小傅哥，微信：fustack
 * @description 决策结果
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecisionMatterResponse {

    /** 活动ID */
    private Long activityId;

}
