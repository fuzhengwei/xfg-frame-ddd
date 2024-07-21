package cn.atsuc.frame.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Constants {

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001", "未知失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        INDEX_DUP("0003", "主键冲突"),
        RATE_LIMITER("0004", "请求已被限流，超过限流配置");

        private String code;
        private String info;

    }

    /**
     * 全局属性
     */
    public static final class Global {
        /**
         * 空节点值
         */
        public static final Long TREE_NULL_NODE = 0L;
    }

    /**
     * 决策树节点
     */
    public static final class NodeType {
        /**
         * 树茎
         */
        public static final Integer STEM = 1;
        /**
         * 果实
         */
        public static final Integer FRUIT = 2;
    }

    /**
     * 规则限定类型
     */
    public static final class RuleLimitType {
        /**
         * 等于
         */
        public static final int EQUAL = 1;
        /**
         * 大于
         */
        public static final int GT = 2;
        /**
         * 小于
         */
        public static final int LT = 3;
        /**
         * 大于&等于
         */
        public static final int GE = 4;
        /**
         * 小于&等于
         */
        public static final int LE = 5;
        /**
         * 枚举
         */
        public static final int ENUM = 6;
    }

}
