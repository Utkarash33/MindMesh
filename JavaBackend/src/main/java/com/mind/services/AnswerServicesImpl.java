package com.mind.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mind.model.Answers;
import com.mind.repository.AnswersRepo;


@Service
public class AnswerServicesImpl  implements AnswerServices {

	
	
	  private static AnswersRepo answersRepo ;
	  
	  @Autowired
	public AnswerServicesImpl(AnswersRepo answersRepo) {
		super();
		this.answersRepo = answersRepo;
	}

	@Override
	public void saveAnswer(Answers answers) {
    
		
		answersRepo.save(answers);
		
	}

	@Override
	public List<Answers> getAnswersList() {
		
		
		return answersRepo.findAll();
	}

	@Override
	public void clearDataBase() {
		
		
		answersRepo.deleteAll();
		
	}

}
