package cn.atsuc.frame.domain.order.model.aggregates;


import cn.atsuc.frame.domain.order.model.entity.OrderItemEntity;
import cn.atsuc.frame.domain.order.model.valobj.OrderIdVO;

import java.util.List;

/**
 * @description 订单聚合对象
 */
public class OrderAggregate {

    private OrderIdVO orderId;
    private List<OrderItemEntity> items;

}
