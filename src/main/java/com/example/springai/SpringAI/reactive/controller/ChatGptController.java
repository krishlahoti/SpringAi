package com.example.springai.SpringAI.reactive.controller;

import com.example.springai.SpringAI.reactive.service.ChatGptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ChatGptController {

    @Autowired
    private ChatGptService chatGptService;

    @GetMapping("/chatgpt")
    public Mono<String> getResponse(@RequestParam String prompt) {
        return chatGptService.getChatGptResponse(prompt);
    }
}