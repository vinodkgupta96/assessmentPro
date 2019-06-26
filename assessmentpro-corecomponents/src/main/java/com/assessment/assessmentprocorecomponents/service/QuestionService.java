package com.assessment.assessmentprocorecomponents.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.assessment.assessmentprocorecomponents.model.Question;

public class QuestionService {
	
	@Autowired
	private AssesssmentQuestionRepository assesssmentQuestionRepository;
	
	
	public Question getQuestionById(Long id) {
		return assesssmentQuestionRepository.getOne(id);
	}

	public List<Question>getAllQuestion(){
		return assesssmentQuestionRepository.findAll();
	}
	
	public void saveQuestion(Question question) {
		assesssmentQuestionRepository.save(question);
	}
}
