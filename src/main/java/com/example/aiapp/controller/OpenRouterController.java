package com.example.aiapp.controller;

import com.example.aiapp.service.OpenRouterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenRouterController {

    private final OpenRouterService openRouterService;

    public OpenRouterController(OpenRouterService openRouterService) {
        this.openRouterService = openRouterService;
    }

    @PostMapping("/mistral")
    public String sendPrompt(@RequestParam String prompt){
        String response = openRouterService.generateResponse(prompt);
        return response;
    }

}
