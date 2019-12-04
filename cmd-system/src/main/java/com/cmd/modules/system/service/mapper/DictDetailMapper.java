package com.cmd.modules.system.service.mapper;

import com.cmd.base.BaseMapper;
import com.cmd.modules.system.domain.DictDetail;
import com.cmd.modules.system.service.dto.DictDetailDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
* @author chenqiang
* @date 2019-04-10
*/
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DictDetailMapper extends BaseMapper<DictDetailDTO, DictDetail> {

}