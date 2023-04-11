package com.oldfish.platform.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 * 用户表
 * @author chenzw
 * @date 2023-04-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel("用户表")
@Entity
@Table(name="system_user")
public class User extends BaseEntity implements UserDetails {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @ApiModelProperty("主键")
    private Long id;

    /**
     * 用户名
     */
    @Column(name="username")
    @ApiModelProperty("用户名")
    private String username;

    /**
     * 密码
     */
    @Column(name="password")
    @ApiModelProperty("密码")
    private String password;

    /**
     * 性别 0-女 1-男
     */
    @Column(name="gender")
    @ApiModelProperty("性别 0-女 1-男")
    private Integer gender;

    /**
     * 身份证号
     */
    @Column(name="id_card")
    @ApiModelProperty("身份证号")
    private String idCard;

    /**
     * 邮箱
     */
    @Column(name="email")
    @ApiModelProperty("邮箱")
    private String email;

    /**
     * 电话
     */
    @Column(name="phone")
    @ApiModelProperty("电话")
    private String phone;

    /**
     * 生日
     */
    @Column(name="birthday")
    @ApiModelProperty("生日")
    private LocalDateTime birthday;

    /**
     * 年龄
     */
    @Column(name="age")
    @ApiModelProperty("年龄")
    private Integer age;

    /**
     * 用户状态——1-正常 2-禁用
     */
    @Column(name="status")
    @ApiModelProperty("用户状态——1-正常 2-禁用")
    private Integer status;

    /**
     * 上次登录时间
     */
    @Column(name="last_login")
    @ApiModelProperty("上次登录时间")
    private LocalDateTime lastLogin;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

