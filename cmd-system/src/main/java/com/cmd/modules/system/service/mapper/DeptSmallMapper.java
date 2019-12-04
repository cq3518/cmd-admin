package com.cmd.modules.system.service.mapper;

import com.cmd.base.BaseMapper;
import com.cmd.modules.system.domain.Dept;
import com.cmd.modules.system.service.dto.DeptSmallDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author chenqiang
* @date 2019-03-25
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DeptSmallMapper extends BaseMapper<DeptSmallDTO, Dept> {

}