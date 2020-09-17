package com.buck.order.controller;


import com.buck.common.ResponseResult;
import com.buck.order.entity.OmsOrder;
import com.buck.order.service.IOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-09-14
 */
@RestController
@RequestMapping("oms-order")
public class OmsOrderController {

    @Autowired
    private IOmsOrderService orderService;

    @GetMapping("/get/{orderId}")
    public ResponseResult<OmsOrder> getOrder(@PathVariable("orderId") String id){
        OmsOrder order = orderService.getById(id);
        return new ResponseResult<>(200,order);
    }
}

