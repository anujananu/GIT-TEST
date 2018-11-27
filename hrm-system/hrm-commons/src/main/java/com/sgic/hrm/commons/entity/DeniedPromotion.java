package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeniedPromotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2553904032570064501L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int requsetId;
	private int designationId;
	private Date deniedDate;
	private String deniedRemark;
	private String position;
	private int deniedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRequsetId() {
		return requsetId;
	}

	public void setRequsetId(int requsetId) {
		this.requsetId = requsetId;
	}

	public int getDesignationId() {
		return designationId;
	}

	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}

	public Date getDeniedDate() {
		return deniedDate;
	}

	public void setDeniedDate(Date deniedDate) {
		this.deniedDate = deniedDate;
	}

	public String getDeniedRemark() {
		return deniedRemark;
	}

	public void setDeniedRemark(String deniedRemark) {
		this.deniedRemark = deniedRemark;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getDeniedBy() {
		return deniedBy;
	}

	public void setDeniedBy(int deniedBy) {
		this.deniedBy = deniedBy;
	}

}
