package com.assessment.assessmentprocorecomponents.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ASSESSMENT_SUBJECT")
public class Subject extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String subjCode;
	
	public Subject() {
		super();
	}
	
	public Subject(String subjCode) {
		super();
		this.subjCode = subjCode;
	}
	public String getSubjCode() {
		return subjCode;
	}
	public void setSubjCode(String subjCode) {
		this.subjCode = subjCode;
	}
	
	

}
