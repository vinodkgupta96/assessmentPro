package com.assessment.assessmentprocorecomponents.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.assessment.assessmentprocorecomponents.model.Question;

@Service
public interface AssesssmentQuestionRepository extends JpaRepository<Question, Long>{

}
