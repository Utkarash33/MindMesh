package com.mind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mind.model.Answers;
import com.mind.services.AnswerServices;

@RestController
@RequestMapping("/user")
public class ChatController {
	private static AnswerServices services;
	@Autowired
	public ChatController(AnswerServices answerServices) {
		super();
		this.services = answerServices;
	}
	@PostMapping("/save")
	public static void saveAnswer(@RequestBody Answers answer)
	{
		services.saveAnswer(answer);
	}
	@GetMapping("/getall")
	public static ResponseEntity<List<Answers>> getAllAnswers()
	{
		return new ResponseEntity<>(services.getAnswersList(),HttpStatus.OK);
	}
	@DeleteMapping("/empty")
	public void removeAllAnswers()
	{
		services.clearDataBase();
	}
}
