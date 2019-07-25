package com.sparkproject.adinspark.bean.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 任务
 * @author ZHANGYACHAO
 * @date 2019/7/22 17:11
 * @since JDK1.8
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {

    private long taskId;
    private String taskName;
    private byte taskType;
    private byte taskStatus;
    private String taskParam;
    private Date createTime;
    private Date startTime;
    private Date finishTime;
}
