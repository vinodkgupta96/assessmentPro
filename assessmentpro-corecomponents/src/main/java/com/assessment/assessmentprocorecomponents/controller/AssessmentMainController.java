package com.assessment.assessmentprocorecomponents.controller;

import com.assessment.assessmentprocorecomponents.model.Question;
import com.assessment.assessmentprocorecomponents.service.AssesssmentQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AssessmentMainController {

	@Autowired
	private AssesssmentQuestionRepository assesssmentQuestionService;
	
	@RequestMapping(value="/saveQuestion", method = RequestMethod.POST)
	public void saveQuestion(@RequestBody Question question) {
		assesssmentQuestionService.save(question);
	}

	@RequestMapping(value="/getQuestion/{id}")
	public Question getQuestion(@PathVariable Long id) {
		return new Question(12L,"question description",null);
	}

	@RequestMapping(value = "/getDummyQuestion")
	public Question getDummyQuestion() {
		return new Question(33L,"Dummy description ",null);
	}
	
	@RequestMapping(value="/hello")
	public String  hello() {
		return "hello";
	}
	
	

}
