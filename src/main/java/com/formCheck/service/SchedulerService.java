package com.formCheck.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.formCheck.model.Author;
import com.formCheck.model.Scheduler;
import com.formCheck.repository.SchedulerRepository;

@Service("schedulerService")
public class SchedulerService {
	
	@Autowired
	private SchedulerRepository schedulerRepository;
	
	public Scheduler saveScheduler(Scheduler scheduler){
		return schedulerRepository.save(scheduler);
	}
	
	public List<String> findShiftAll(){
		return schedulerRepository.findShift();
	}
	
	public List<Date> findDateAll(){
		return schedulerRepository.findDate();
	}
	
	
	
}
