package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 广告实时统计
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:20
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdStat implements Serializable {

    private String date;
    private String province;
    private String city;
    private long adId;
    private long clickCount;
}
