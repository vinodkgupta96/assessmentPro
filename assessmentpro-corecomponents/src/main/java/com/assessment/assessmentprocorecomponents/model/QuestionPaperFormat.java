package com.assessment.assessmentprocorecomponents.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ASSESSMENT_QUESTION_PAPER")
public class QuestionPaperFormat extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long noOfQuestion;
	private String questionPaperFormatTagLine;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<QuestionPaperFormatSection> questionPaperFormatSections;

	public QuestionPaperFormat() {
		super();
	}
	
	public QuestionPaperFormat(Long noOfQuestion, String questionPaperFormatTagLine,
			List<QuestionPaperFormatSection> questionPaperFormatSections) {
		super();
		this.noOfQuestion = noOfQuestion;
		this.questionPaperFormatTagLine = questionPaperFormatTagLine;
		this.questionPaperFormatSections = questionPaperFormatSections;
	}

	public Long getNoOfQuestion() {
		return noOfQuestion;
	}

	public void setNoOfQuestion(Long noOfQuestion) {
		this.noOfQuestion = noOfQuestion;
	}

	public String getQuestionPaperFormatTagLine() {
		return questionPaperFormatTagLine;
	}

	public void setQuestionPaperFormatTagLine(String questionPaperFormatTagLine) {
		this.questionPaperFormatTagLine = questionPaperFormatTagLine;
	}

	public List<QuestionPaperFormatSection> getQuestionPaperFormatSections() {
		return questionPaperFormatSections;
	}

	public void setQuestionPaperFormatSections(List<QuestionPaperFormatSection> questionPaperFormatSections) {
		this.questionPaperFormatSections = questionPaperFormatSections;
	}
	
	

	
}
