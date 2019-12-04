package com.cmd.service.dto;

import lombok.Data;
import com.cmd.annotation.Query;

import java.sql.Timestamp;

/**
 * @author chenqiang
 * @date 2019-12-04 09:54:37
 */
@Data
public class QiniuQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String key;

    @Query(type = Query.Type.GREATER_THAN,propName = "updateTime")
    private Timestamp startTime;

    @Query(type = Query.Type.LESS_THAN,propName = "updateTime")
    private Timestamp endTime;
}
