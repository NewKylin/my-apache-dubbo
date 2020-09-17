package com.buck.order.mapper;

import com.buck.order.entity.OmsOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-09-14
 */
public interface OmsOrderMapper extends BaseMapper<OmsOrder> {

    @Select("select * from oms_order where id=#{orderId}")
    OmsOrder selectByOrderId(@Param("orderId") String orderId);
}
