package com.mind.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mind.services.ClientService;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

@RestController
@RequestMapping(value = "openai", produces = MediaType.APPLICATION_JSON_VALUE)
public class BotController {
  
  @Value("${openai.api.chat.default.role}")
  private String defaultRole;
  
  @Autowired
  private ClientService chatGPTClientService;

    @GetMapping("chat")
    public String chatGptRequest(@RequestBody String prompt) {
      
      final OpenAiService service = chatGPTClientService.getOpenAiService();
      final ChatCompletionRequest chatRequest = chatGPTClientService.getChatCompletionRequest(List.of(new ChatMessage(defaultRole, prompt)));
        System.out.println("line 34");
    return service.createChatCompletion(chatRequest).getChoices().get(0).getMessage().getContent();
    }
}