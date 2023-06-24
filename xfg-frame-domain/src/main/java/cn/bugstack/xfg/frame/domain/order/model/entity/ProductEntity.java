package cn.bugstack.xfg.frame.domain.order.model.entity;

import cn.bugstack.xfg.frame.domain.order.model.valobj.ProductDescriptionVO;
import cn.bugstack.xfg.frame.domain.order.model.valobj.ProductNameVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 小傅哥，微信：fustack
 * @description 产品实体
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    private ProductNameVO product;
    private ProductDescriptionVO productDescription;

}
