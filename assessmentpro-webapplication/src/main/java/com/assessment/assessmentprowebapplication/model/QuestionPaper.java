package com.assessment.assessmentprowebapplication.model;

import java.util.List;
public class QuestionPaper extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private QuestionPaperFormat questionPaperFormat;
	private List<Subject>subjects;
	
	
	
	public QuestionPaper() {
		super();
	}
	
	public QuestionPaper(QuestionPaperFormat questionPaperFormat, List<Subject> subjects) {
		super();
		this.questionPaperFormat = questionPaperFormat;
		this.subjects = subjects;
	}
	public QuestionPaperFormat getQuestionPaperFormat() {
		return questionPaperFormat;
	}
	public void setQuestionPaperFormat(QuestionPaperFormat questionPaperFormat) {
		this.questionPaperFormat = questionPaperFormat;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	
	
	
	
	
}
