package com.mind.services;

import java.time.Duration;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

@Service
public class ClientService {



   @Value("${openai.api.seacret.key}")
   private String apiKey;   
   @Value("${openai.api.chat.default.model}")
   private String defaultModel;   
   @Value("${openai.api.chat.default.role}")
   private String defaultRole;   
   @Value("${openai.api.max-completions}")
   private int maxCompletions;   
   @Value("${openai.api.temperature}")
   private double temperature;   
   @Value("${openai.api.max_tokens}")
   private int maxTokesns;   
   @Value("${openai.api.default.timeout}")
   private int timeout;

   
   public OpenAiService getOpenAiService() {
     return new OpenAiService(apiKey, Duration.ofSeconds(timeout));
   }
   

    public ChatCompletionRequest getChatCompletionRequest(final List<ChatMessage> chatMessageReuest) {
      
       return ChatCompletionRequest
            .builder()
        .messages(chatMessageReuest)
        .model(defaultModel)
        .maxTokens(maxTokesns)
        .temperature(temperature)
        .n(maxCompletions)
        .build();
    }
    
    public void shutdownExecutor(final OpenAiService service) {
      service.shutdownExecutor();
    }
}