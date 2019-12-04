package com.cmd.modules.system.service.mapper;

import com.cmd.base.BaseMapper;
import com.cmd.modules.system.domain.Job;
import com.cmd.modules.system.service.dto.JobSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author chenqiang
* @date 2019-03-29
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface JobSmallMapper extends BaseMapper<JobSmallDTO, Job> {

}