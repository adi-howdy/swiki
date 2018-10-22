package com.formCheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formCheck.model.Author;
import com.formCheck.model.Scheduler;
import com.formCheck.repository.SchedulerRepository;

@Service("schedulerService")
public class SchedulerService {
	
	@Autowired
	private SchedulerRepository schedulerRepository;
	
	public Scheduler saveScheduler(Scheduler scheduler){
		System.out.print("scheuler stufff  oneeeeeeeee" + scheduler.getLocation() + "\n");
		return schedulerRepository.save(scheduler);
	}
	
}
