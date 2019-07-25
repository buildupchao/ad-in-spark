package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 页面切片转化率
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:25
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageSplitConvertRate implements Serializable {

    private long taskId;
    private String convertRate;
}
