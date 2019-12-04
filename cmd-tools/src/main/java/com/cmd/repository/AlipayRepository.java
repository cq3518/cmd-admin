package com.cmd.repository;

import com.cmd.domain.AlipayConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenqiang
 * @date 2018-12-31
 */
public interface AlipayRepository extends JpaRepository<AlipayConfig,Long> {
}
