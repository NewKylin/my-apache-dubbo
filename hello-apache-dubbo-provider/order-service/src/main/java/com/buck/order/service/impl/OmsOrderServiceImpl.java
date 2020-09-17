package com.buck.order.service.impl;

import com.buck.order.entity.OmsOrder;
import com.buck.order.mapper.OmsOrderMapper;
import com.buck.order.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-09-14
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
