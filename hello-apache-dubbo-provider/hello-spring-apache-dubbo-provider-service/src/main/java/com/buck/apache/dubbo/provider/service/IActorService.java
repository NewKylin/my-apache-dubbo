package com.buck.apache.dubbo.provider.service;

import com.buck.apache.dubbo.provider.entity.Actor;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-08-13
 */
public interface IActorService extends IService<Actor> {

    Actor getByActorId(int actorid);
}
