package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户广告点击量
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:22
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdUserClickCount implements Serializable {

    private String date;
    private long userId;
    private long adId;
    private long clickCount;
}
