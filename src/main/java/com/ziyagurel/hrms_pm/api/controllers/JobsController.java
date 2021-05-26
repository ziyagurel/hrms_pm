package com.ziyagurel.hrms_pm.api.controllers;

import com.ziyagurel.hrms_pm.business.abstracts.IJobService;
import com.ziyagurel.hrms_pm.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    private final IJobService service;

    @Autowired
    public JobsController(IJobService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<Job> getAll(){
        return service.getAll();
    }
}
