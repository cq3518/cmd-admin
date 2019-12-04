package com.cmd.modules.system.service;

import com.cmd.modules.system.service.dto.DictDetailDTO;
import com.cmd.modules.system.service.dto.DictDetailQueryCriteria;
import com.cmd.modules.system.domain.DictDetail;
import org.springframework.data.domain.Pageable;
import java.util.Map;

/**
* @author chenqiang
* @date 2019-04-10
*/
public interface DictDetailService {

    DictDetailDTO findById(Long id);

    DictDetailDTO create(DictDetail resources);

    void update(DictDetail resources);

    void delete(Long id);

    Map queryAll(DictDetailQueryCriteria criteria, Pageable pageable);
}