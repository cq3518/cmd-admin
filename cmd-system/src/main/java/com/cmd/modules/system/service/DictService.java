package com.cmd.modules.system.service;

import com.cmd.modules.system.service.dto.DictDTO;
import com.cmd.modules.system.domain.Dict;
import com.cmd.modules.system.service.dto.DictQueryCriteria;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
* @author chenqiang
* @date 2019-04-10
*/
public interface DictService {

    Map<String,Object> queryAll(DictQueryCriteria dict, Pageable pageable);

    List<DictDTO> queryAll(DictQueryCriteria dict);

    DictDTO findById(Long id);

    DictDTO create(Dict resources);

    void update(Dict resources);

    void delete(Long id);

    void download(List<DictDTO> queryAll, HttpServletResponse response) throws IOException;
}