package com.zhu.nacos.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author GH
 * @Description:
 * @date 2023/8/16 11:14
 */
@RefreshScope
@Data
public class NacosConfig {

    @Value("${custom.nacos.name}")
    private String username;

    @Value("${custom.nacos.age}")
    private Integer age;

}
