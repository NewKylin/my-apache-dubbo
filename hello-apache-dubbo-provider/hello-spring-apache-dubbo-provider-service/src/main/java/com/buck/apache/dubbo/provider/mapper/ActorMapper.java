package com.buck.apache.dubbo.provider.mapper;

import com.buck.apache.dubbo.provider.entity.Actor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-08-13
 */
public interface ActorMapper extends BaseMapper<Actor> {

    @Select("select * from actor where actor_id = #{actorId}")
    Actor getByActorId(@Param("actorId") int actorId);
}
