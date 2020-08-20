package com.buck.apache.dubbo.provider.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class OmOrder implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id")
    private String id;

    private String userid;

    private LocalDateTime createdate;

    private String address;

    private String apiorderid;

    private Integer ordersource;


}
