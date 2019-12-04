package com.cmd.service.dto;

import lombok.Data;
import com.cmd.annotation.Query;

import java.sql.Timestamp;

/**
 * sm.ms图床
 *
 * @author chenqiang
 * @date 2019-12-04 09:52:09
 */
@Data
public class PictureQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String filename;
    
    @Query(type = Query.Type.INNER_LIKE)
    private String username;

    @Query(type = Query.Type.GREATER_THAN,propName = "createTime")
    private Timestamp startTime;

    @Query(type = Query.Type.LESS_THAN,propName = "createTime")
    private Timestamp endTime;
}
