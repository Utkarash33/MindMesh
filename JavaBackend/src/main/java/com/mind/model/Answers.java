package com.mind.model;

import java.util.HashMap;
import java.util.Map;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Answers {
	
	
	@Id
	private Integer id;
	
	private String answers;
}
