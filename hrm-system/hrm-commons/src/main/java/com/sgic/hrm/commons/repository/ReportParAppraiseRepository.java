package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgic.hrm.commons.entity.ReportParAppraise;

@Repository
public interface ReportParAppraiseRepository extends JpaRepository<ReportParAppraise, Integer> {

}