package com.buck.order.service.impl;

import com.buck.order.entity.OmsOrderItem;
import com.buck.order.mapper.OmsOrderItemMapper;
import com.buck.order.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-09-14
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
