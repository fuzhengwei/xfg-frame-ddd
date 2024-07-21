package cn.atsuc.frame.domain.order.model.entity;

import cn.atsuc.frame.domain.order.model.valobj.ProductDescriptionVO;
import cn.atsuc.frame.domain.order.model.valobj.ProductNameVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description 产品实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    private ProductNameVO product;
    private ProductDescriptionVO productDescription;

}
