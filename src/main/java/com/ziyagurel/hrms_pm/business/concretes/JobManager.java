package com.ziyagurel.hrms_pm.business.concretes;

import com.ziyagurel.hrms_pm.business.abstracts.IJobService;
import com.ziyagurel.hrms_pm.dataAccess.abstracts.IJobsDao;
import com.ziyagurel.hrms_pm.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobManager implements IJobService {

    private IJobsDao dao;

    @Autowired
    public JobManager(IJobsDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Job> getAll() {
        return dao.findAll();
    }
}
