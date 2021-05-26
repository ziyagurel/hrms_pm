package com.ziyagurel.hrms_pm.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
public class Job {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "position")
    private String position;

    public Job(){

    }
}
