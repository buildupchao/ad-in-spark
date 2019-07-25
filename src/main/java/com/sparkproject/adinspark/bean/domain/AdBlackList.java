package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 广告黑名单
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:14
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdBlackList implements Serializable {

    private long userId;
}
