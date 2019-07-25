package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 广告点击趋势
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:18
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdClickTrend implements Serializable {

    private String date;
    private String hour;
    private String minute;
    private long adId;
    private long clickCount;
}
