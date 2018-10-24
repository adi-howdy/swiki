package com.formCheck.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import com.formCheck.model.Scheduler;



public interface SchedulerRepository extends JpaRepository<Scheduler, Integer> {

	@Query(value ="select distinct(shift) from scheduler", nativeQuery = true)
	List<String> findShift();
	
	@Query(value ="select distinct(date) from scheduler", nativeQuery = true)
	List<Date> findDate();
}
