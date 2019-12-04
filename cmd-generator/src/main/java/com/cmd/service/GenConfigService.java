package com.cmd.service;

import com.cmd.domain.GenConfig;

/**
 * @author chenqiang
 * @date 2019-01-14
 */
public interface GenConfigService {

    GenConfig find();

    GenConfig update(GenConfig genConfig);
}
