package com.mind.services;

import java.util.List;

import com.mind.model.Answers;

public interface AnswerServices {

	
   /**
    * To save the answer to the data base
    * @param answers Object of the answer contains the question number and the answer string
    */
	public void saveAnswer(Answers answers);
	
	/**
	 * To get the list of all the answers
	 * @return List of the Answers object
	 */
	public List<Answers> getAnswersList();
	
	
	/**
	 * This method is use to clear the database after the interview is over
	 */
	public  void clearDataBase();
	
}
