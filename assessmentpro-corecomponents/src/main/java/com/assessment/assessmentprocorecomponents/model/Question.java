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
@Table(name = "ASSESSMENT_QUESTION")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;

	@OneToMany
	private List<Subject>subjects;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer>answers;
	
	public Question() {
		super();
	}	
	
	public Question(Long id, String description,List<Answer>answers) {
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
