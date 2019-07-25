package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 各省top3热门广告
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:19
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdProvinceTop3 implements Serializable {

    private String date;
    private String province;
    private long adId;
    private long clickCount;
}
