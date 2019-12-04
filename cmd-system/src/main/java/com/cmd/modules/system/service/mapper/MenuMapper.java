package com.cmd.modules.system.service.mapper;

import com.cmd.base.BaseMapper;
import com.cmd.modules.system.domain.Menu;
import com.cmd.modules.system.service.dto.MenuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author chenqiang
 * @date 2018-12-17
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MenuMapper extends BaseMapper<MenuDTO, Menu> {

}
