package com.cmd.modules.quartz.service.dto;

import lombok.Data;
import com.cmd.annotation.Query;

import java.sql.Timestamp;

/**
 * @author chenqiang
 * @date 2019-12-04 10:33:02
 */
@Data
public class JobQueryCriteria {

    @Query(type = Query.Type.INNER_LIKE)
    private String jobName;

    @Query
    private Boolean isSuccess;

    @Query(type = Query.Type.GREATER_THAN,propName = "createTime")
    private Timestamp startTime;

    @Query(type = Query.Type.LESS_THAN,propName = "createTime")
    private Timestamp endTime;
}
