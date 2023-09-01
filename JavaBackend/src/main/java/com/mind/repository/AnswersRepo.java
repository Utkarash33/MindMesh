package com.mind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mind.model.Answers;

public interface AnswersRepo  extends JpaRepository<Answers, Integer> {

}
