package com.cmd.modules.quartz.task;

import com.cmd.modules.monitor.service.VisitsService;
import org.springframework.stereotype.Component;

/**
 * @author chenqiang
 * @date 2018-12-25
 */
@Component
public class VisitsTask {

    private final VisitsService visitsService;

    public VisitsTask(VisitsService visitsService) {
        this.visitsService = visitsService;
    }

    public void run(){
        visitsService.save();
    }
}
