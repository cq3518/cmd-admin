package com.cmd.repository;

import com.cmd.domain.EmailConfig;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chenqiang
 * @date 2018-12-26
 */
public interface EmailRepository extends JpaRepository<EmailConfig,Long> {
}
