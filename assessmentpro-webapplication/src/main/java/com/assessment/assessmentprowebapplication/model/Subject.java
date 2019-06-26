package com.assessment.assessmentprowebapplication.model;

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
