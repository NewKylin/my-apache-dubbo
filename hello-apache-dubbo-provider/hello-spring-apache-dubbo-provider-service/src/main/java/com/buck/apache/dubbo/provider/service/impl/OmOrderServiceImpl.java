package com.buck.apache.dubbo.provider.service.impl;

import com.buck.apache.dubbo.provider.entity.OmOrder;
import com.buck.apache.dubbo.provider.mapper.OmOrderMapper;
import com.buck.apache.dubbo.provider.service.IOmOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-08-17
 */
@Service
public class OmOrderServiceImpl extends ServiceImpl<OmOrderMapper, OmOrder> implements IOmOrderService {

}
