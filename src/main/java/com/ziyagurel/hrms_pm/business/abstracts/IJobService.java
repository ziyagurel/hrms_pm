package com.ziyagurel.hrms_pm.business.abstracts;

import com.ziyagurel.hrms_pm.entities.concretes.Job;

import java.util.List;

public interface IJobService {

    List<Job> getAll();
}
