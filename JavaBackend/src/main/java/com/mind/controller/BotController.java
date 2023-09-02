package com.mind.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mind.model.Prompts;
import com.mind.services.ClientService;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

@RestController
@RequestMapping(value = "mind", produces = MediaType.APPLICATION_JSON_VALUE)
public class BotController {
  
  @Value("${openai.api.chat.default.role}")
  private String defaultRole;
  
  
  @Autowired
  private Prompts prompts;
  
  
  @Autowired
  private ClientService chatGPTClientService;

    @GetMapping("{role}")
    public String chatGptRequest(@PathVariable String role) {

    	String prompt = prompts.getPrompt(role.toUpperCase());
    	
      final OpenAiService service = chatGPTClientService.getOpenAiService();
      final ChatCompletionRequest chatRequest = chatGPTClientService.getChatCompletionRequest(List.of(new ChatMessage(defaultRole, prompt)));
    return service.createChatCompletion(chatRequest).getChoices().get(0).getMessage().getContent();
    }
    
    
    @PostMapping("/feedback/out")
    public String chatGptFeedback(@RequestBody Map<String, String> qAndA)
    {
    	String prompt = prompts.getPrompt("feedback".toUpperCase());
    	
    	prompt+=qAndA.toString();
    	
        final OpenAiService service = chatGPTClientService.getOpenAiService();
        final ChatCompletionRequest chatRequest = chatGPTClientService.getChatCompletionRequest(List.of(new ChatMessage(defaultRole, prompt)));
      return service.createChatCompletion(chatRequest).getChoices().get(0).getMessage().getContent();
    }
}