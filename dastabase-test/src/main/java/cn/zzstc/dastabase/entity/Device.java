package cn.zzstc.dastabase.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author youyp
 * @since 2018-09-21
 */
@Getter
@Setter
public class Device implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备ID
     */
    @TableId(value = "device_id", type = IdType.AUTO)
    private Integer deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * mac地址
     */
    private String macAddress;

    /**
     * 版本号
     */
    private String version;

    /**
     * ip地址
     */
    private String deviceIp;

    private Integer devicePort;

    /**
     * 设备网关
     */
    private String deviceGateway;

    /**
     * 子网掩码
     */
    private String subnetMask;

    /**
     * 联网状态（0：不在线，1：在线）
     */
    private Integer netStatus;

    /**
     * 状态(1:启用，0：不启用)
     */
    private Integer status;

    /**
     * 创建者
     */
    private Integer createdBy;

    /**
     * 更新者
     */
    private Integer updatedBy;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;


}
