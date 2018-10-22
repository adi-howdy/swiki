package com.formCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;

import com.formCheck.model.Scheduler;

public interface SchedulerRepository extends JpaRepository<Scheduler, Integer> {

}
