package com.oldfish.platform.system.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建人
     */
    @ApiModelProperty("创建人")
    @Column(name="created_by")
    private Long createdBy;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @Column(name="created_time")
    private LocalDateTime createdTime;

    /**
     * 修改人
     */
    @ApiModelProperty("修改人")
    @Column(name="updated_by")
    private Long updatedBy;

    /**
     * 修改时间
     */
    @ApiModelProperty("修改时间")
    @Column(name="updated_time")
    private LocalDateTime updatedTime;

    /**
     * 逻辑删除字段 0-未删除 1-已删除
     */
    @ApiModelProperty("逻辑删除字段 0-未删除 1-已删除")
    @Column(name="is_deleted")
    private Integer isDeleted;

    /**
     * 备注
     */
    @ApiModelProperty("备注")
    @Column(name="remark")
    private String remark;

}
