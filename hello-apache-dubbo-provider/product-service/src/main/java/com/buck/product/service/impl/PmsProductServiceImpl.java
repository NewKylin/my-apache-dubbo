package com.buck.product.service.impl;

import com.buck.product.entity.PmsProduct;
import com.buck.product.mapper.PmsProductMapper;
import com.buck.product.service.IPmsProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-09-14
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements IPmsProductService {

}
