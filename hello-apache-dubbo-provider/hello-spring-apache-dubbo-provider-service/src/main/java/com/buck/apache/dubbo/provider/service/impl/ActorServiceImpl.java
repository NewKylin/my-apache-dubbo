package com.buck.apache.dubbo.provider.service.impl;

import com.buck.apache.dubbo.provider.entity.Actor;
import com.buck.apache.dubbo.provider.mapper.ActorMapper;
import com.buck.apache.dubbo.provider.service.IActorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-08-13
 */
@Service
public class ActorServiceImpl extends ServiceImpl<ActorMapper, Actor> implements IActorService {

    @Override
    public Actor getByActorId(int actorid) {

        return null;
    }
}
