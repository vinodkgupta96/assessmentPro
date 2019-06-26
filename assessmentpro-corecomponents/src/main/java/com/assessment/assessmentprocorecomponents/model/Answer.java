package com.assessment.assessmentprocorecomponents.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ASSESSMENT_ANSWER")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
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
