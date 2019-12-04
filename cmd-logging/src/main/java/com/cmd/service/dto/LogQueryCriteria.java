package com.cmd.service.dto;

import lombok.Data;
import com.cmd.annotation.Query;

import java.sql.Timestamp;

/**
 * 日志查询类
 * @author chenqiang
 * @date 2019-12-04 09:23:07
 */
@Data
public class LogQueryCriteria {

    // 多字段模糊
    @Query(blurry = "username,description,address,requestIp,method,params")
    private String blurry;

    @Query
    private String logType;

    @Query(type = Query.Type.GREATER_THAN,propName = "createTime")
    private Timestamp startTime;

    @Query(type = Query.Type.LESS_THAN,propName = "createTime")
    private Timestamp endTime;
}
