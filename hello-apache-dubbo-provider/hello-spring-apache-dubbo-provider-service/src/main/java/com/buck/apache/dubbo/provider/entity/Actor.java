package com.buck.apache.dubbo.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-08-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Actor implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "actor_id",type = IdType.AUTO)
    private Integer actorId;

    private String firstName;

    private String lastName;

    private LocalDateTime lastUpdate;


}
