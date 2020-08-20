package com.buck.apache.dubbo.provider;

import com.buck.apache.dubbo.provider.entity.Actor;
import com.buck.apache.dubbo.provider.mapper.ActorMapper;
import com.buck.apache.dubbo.provider.service.IActorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @program: hello-apache-dubbo
 * @description:
 * @author: buck
 * @create: 2020-08-13 14:48
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional
//防止对数据造成污染，可以加上rollback注解，默认是true。加上之后任何对数据造成修改的操作都会被回滚
@Rollback(value = false)
public class ActorTest {

    @Autowired
    private ActorMapper actorMapper;

    @Autowired
    private IActorService actorService;

    @Test
    public void testAddActor(){

        for (int i=0;i<100000;i++){
            Actor actor = new Actor();
            actor.setFirstName("yan"+i);
            actor.setLastName("xun"+i);
            actor.setLastUpdate(LocalDateTime.now());
            actorMapper.insert(actor);
        }
    }
    @Test
    public void testBatchInsert(){
        ArrayList<Actor> actors = new ArrayList<>();
        for(int i=0;i<50000000;i++){
            Actor actor = new Actor();
            actor.setFirstName("yan"+i);
            actor.setLastName("xun"+i);
            actor.setLastUpdate(LocalDateTime.now());
            actors.add(actor);
            if(actors.size() == 1000){
                actorService.saveBatch(actors);
                actors.clear();
            }
        }
    }

    @Test
    public void testSelect(){

        Actor actor = actorMapper.getByActorId(1);
        System.out.println("first name is :"+actor.getFirstName());
    }
}
