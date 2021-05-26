package com.ziyagurel.hrms_pm.dataAccess.abstracts;

import com.ziyagurel.hrms_pm.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobsDao extends JpaRepository<Job,Integer> {

}
