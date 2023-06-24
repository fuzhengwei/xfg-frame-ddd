package cn.bugstack.xfg.frame.domain.order.model.aggregates;

import cn.bugstack.xfg.frame.domain.order.model.entity.OrderItemEntity;
import cn.bugstack.xfg.frame.domain.order.model.valobj.OrderIdVO;

import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description 订单聚合对象
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class OrderAggregate {

    private OrderIdVO orderId;
    private List<OrderItemEntity> items;

}
