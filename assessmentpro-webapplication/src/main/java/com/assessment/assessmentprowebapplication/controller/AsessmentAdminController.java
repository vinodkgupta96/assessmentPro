package com.assessment.assessmentprowebapplication.controller;

import com.assessment.assessmentprowebapplication.model.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/assessmentadmin")
public class AsessmentAdminController {

    @RequestMapping(value= "/home")
    public ModelAndView getHome(){
        System.out.println("home.jsp");
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/connect")
    public ModelAndView connectToAssessment(){
        Map<String,String> map = new HashMap<>();
        map.put("abc","abc");
        RestTemplate restTemplate = new RestTemplate();
        Question q= restTemplate.getForObject("http://assessment/getQuestion/1", Question.class);
        System.out.println(q);

        return new ModelAndView("home",map);
    }




}
