package com.Practice.JobAppJSP.service;


import com.Practice.JobAppJSP.model.JobPost;
import com.Practice.JobAppJSP.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRepo jobRepo;

    public List<JobPost> getAllJobs(){
        return jobRepo.viewAllJobs();
    }

    public void addJob(JobPost job){
        jobRepo.addJobs(job);
    }

}
