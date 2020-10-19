package com.buck.order;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.buck.order.entity.OmsOrder;
import com.buck.order.service.IOmsOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-09-18 15:20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {

    @Autowired
    private IOmsOrderService orderService;
    /**
     * mysql连接池测试
     */
    @Test
    public void mysqlConnection_test() throws InterruptedException {

        OmsOrder order = new OmsOrder();
        order.setDeliveryCompany("圆通");
        UpdateWrapper<OmsOrder> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id",12);
        for(int i =0;i<11;i++){
            Thread thread = new Thread(()->{
                try {
                    System.out.println(Thread.currentThread().getName());
                    orderService.update(order,updateWrapper);
                }catch (Exception ex){
                    System.out.println("线程："+Thread.currentThread().getName());
                    ex.printStackTrace();
                }
            });
            thread.start();
            Thread.sleep(2000);
        }
        for (;;){}
    }

}
