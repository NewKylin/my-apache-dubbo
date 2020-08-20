package com.buck.apache.dubbo.provider.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmOrderDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id")
    private String id;

    private String orderid;

    private String wareid;

    private String warename;

    private Integer qty;

    private LocalDateTime createdate;


}
