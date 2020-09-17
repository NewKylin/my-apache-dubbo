package com.buck.product.controller;


import com.buck.common.ResponseResult;
import com.buck.product.entity.PmsProduct;
import com.buck.product.service.IPmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
/**
 * <p>
 * 商品信息 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-09-14
 */
@RestController
@RequestMapping("/pms-product")
public class PmsProductController {

    @Autowired
    private IPmsProductService pmsProductService;

    @GetMapping("/get/{productId}")
    public ResponseResult<PmsProduct> getProduct(@PathVariable("productId") String productId){
        PmsProduct product = pmsProductService.getById(productId);
        return new ResponseResult<>(200,product);
    }
}

