package com.assessment.assessmentprowebapplication.model;

import java.util.List;

public class Answer {

	private Long id;
	private String description;
	
	private List<Analysis>analysises;
	
	public Answer() {
		super();
	}
	
	public Answer(Long id, String description, List<Analysis> analysises) {
		super();
		this.id = id;
		this.description = description;
		this.analysises = analysises;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Analysis> getAnalysises() {
		return analysises;
	}

	public void setAnalysises(List<Analysis> analysises) {
		this.analysises = analysises;
	}
	

	
}
