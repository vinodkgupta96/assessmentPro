package com.assessment.assessmentprocorecomponents.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ASSESSMENT_QUESTION_PAPER_FORMAT_SECTION")
public class QuestionPaperFormatSection extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long noOfQuestions;
	private String sectionTagLine;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Question>questions;
	
	public QuestionPaperFormatSection() {
		super();
	}	
	
	public QuestionPaperFormatSection(Long noOfQuestions, String sectionTagLine, List<Question> questions) {
		super();
		this.noOfQuestions = noOfQuestions;
		this.sectionTagLine = sectionTagLine;
		this.questions = questions;
	}

	public Long getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(Long noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public String getSectionTagLine() {
		return sectionTagLine;
	}

	public void setSectionTagLine(String sectionTagLine) {
		this.sectionTagLine = sectionTagLine;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
}
