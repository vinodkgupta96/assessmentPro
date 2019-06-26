package com.assessment.assessmentprowebapplication.model;

import java.util.List;

public class Question {

	private Long id;
	private String description;

	private List<Subject>subjects;
	
	private List<Answer>answers;
	
	public Question() {
		super();
	}	
	
	public Question(Long id, String description, List<Answer>answers) {
		super();
		this.id = id;
		this.description = description;
		this.answers=answers;
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

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
}
