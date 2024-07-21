package cn.atsuc.frame.domain.rule.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 决策结果实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EngineResultEntity {

    /** 执行结果 */
    private boolean isSuccess;
    /** 用户ID */
    private String userId;
    /** 规则树ID */
    private Long treeId;
    /** 果实节点ID */
    private Long nodeId;
    /** 果实节点值 */
    private String nodeValue;

    public EngineResultEntity(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }
}
