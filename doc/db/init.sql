-- platform.`system_user` definition
CREATE TABLE `system_user` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `username` varchar(30) DEFAULT NULL COMMENT '用户名',
    `password` varchar(100) DEFAULT NULL COMMENT '密码',
    `gender` tinyint(4) DEFAULT NULL COMMENT '性别 0-女 1-男',
    `id_card` varchar(30) DEFAULT NULL COMMENT '身份证号',
    `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
    `phone` varchar(30) DEFAULT NULL COMMENT '电话',
    `birthday` datetime DEFAULT NULL COMMENT '生日',
    `age` int(11) DEFAULT NULL COMMENT '年龄',
    `status` tinyint(4) DEFAULT '1' COMMENT '用户状态——1-正常 2-禁用',
    `last_login` datetime DEFAULT NULL COMMENT '上次登录时间',
    `created_by` bigint(20) DEFAULT NULL COMMENT '创建人的ID',
    `created_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_by` bigint(20) DEFAULT NULL COMMENT '修改人ID',
    `updated_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    `is_deleted` tinyint(4) DEFAULT '0' COMMENT '逻辑删除的状态 0-未删除 1-已删除',
    `remark` varchar(200) DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

