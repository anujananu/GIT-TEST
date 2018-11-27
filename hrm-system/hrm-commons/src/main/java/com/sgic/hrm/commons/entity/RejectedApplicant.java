package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(schema = "employee", name = "rejectedApplicant")
public class RejectedApplicant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2885414555841517222L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="applicant_id")
	private Applicant applicantid;
	private String reason;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Applicant getApplicantid() {
		return applicantid;
	}
	public void setApplicantid(Applicant applicantid) {
		this.applicantid = applicantid;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
