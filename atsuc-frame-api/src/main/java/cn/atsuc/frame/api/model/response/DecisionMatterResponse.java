package cn.atsuc.frame.api.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description 决策结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecisionMatterResponse {

    /** 活动ID */
    private Long activityId;

}
