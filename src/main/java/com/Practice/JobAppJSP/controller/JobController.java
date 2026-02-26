package com.Practice.JobAppJSP.controller;

import com.Practice.JobAppJSP.model.JobPost;
import com.Practice.JobAppJSP.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping ({"/","home"})
    public String home(){
        System.out.println("Live running");
        return "home";
    }

   @GetMapping("addjob")
    public String addJob(){
        return"addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost job){
        service.addJob(job);
        return "sucess";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewalljobs";
    }
}
