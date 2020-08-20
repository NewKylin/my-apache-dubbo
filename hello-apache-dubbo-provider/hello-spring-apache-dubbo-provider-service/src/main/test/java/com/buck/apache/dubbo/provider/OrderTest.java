package com.buck.apache.dubbo.provider;

import com.buck.apache.dubbo.provider.entity.OmOrder;
import com.buck.apache.dubbo.provider.entity.OmOrderDetail;
import com.buck.apache.dubbo.provider.service.impl.OmOrderDetailServiceImpl;
import com.buck.apache.dubbo.provider.service.impl.OmOrderServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @program: hello-apache-dubbo
 * @description: 订单测试
 * @author: buck
 * @create: 2020-08-17 09:13
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {

    @Autowired
    private OmOrderServiceImpl omOrderService;

    @Autowired
    private OmOrderDetailServiceImpl omOrderDetailService;

    @Test
    public void testAddOrder(){
        OmOrder omOrder = new OmOrder();
        String orderId = UUID.randomUUID().toString();
        omOrder.setId(orderId);
        omOrder.setAddress("广东省广州市荔湾区");
        omOrder.setApiorderid("1234545");
        omOrder.setOrdersource(1);
        omOrder.setUserid("5000");
        omOrder.setCreatedate(LocalDateTime.now());
        omOrderService.save(omOrder);

        OmOrderDetail omOrderDetail = new OmOrderDetail();
        String detailId = UUID.randomUUID().toString();
        omOrderDetail.setId(detailId);
        omOrderDetail.setOrderid(orderId);
        omOrderDetail.setQty(1);
        omOrderDetail.setCreatedate(LocalDateTime.now());
        omOrderDetailService.save(omOrderDetail);
    }
}
