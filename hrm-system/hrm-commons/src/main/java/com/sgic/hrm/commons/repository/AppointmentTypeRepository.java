package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.AppointmentType;


public interface AppointmentTypeRepository extends JpaRepository<AppointmentType, Integer> {
	
}
