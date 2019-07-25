package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 各区域top3热门商品
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:23
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaTop3Product implements Serializable {

    private long taskId;
    private String area;
    private String areaLevel;
    private String cityInfos;
    private long clickCount;
    private long productId;
    private String productName;
    private String productStatus;
}
