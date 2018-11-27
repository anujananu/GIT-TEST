package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema="employee")
public class WelfareType implements Serializable {

	private static final long serialVersionUID = 1227324474677159440L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String welfareTypeName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWelfareTypeName() {
		return welfareTypeName;
	}
	public void setWelfareTypeName(String welfareTypeName) {
		this.welfareTypeName = welfareTypeName;
	}

}
