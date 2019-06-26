package com.assessment.assessmentprowebapplication.model;

import java.util.List;

public class QuestionPaperFormatSection extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long noOfQuestions;
	private String sectionTagLine;
	
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
