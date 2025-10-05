package com.example.aiapp.service;

import com.example.aiapp.dal.OpenRouterDal;
import com.example.aiapp.repository.AiLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OpenRouterService {

    private final AiLogRepository aiLogRepository;
    private final OpenRouterDal openRouterDal;

    public OpenRouterService(OpenRouterDal openRouterDal, AiLogRepository aiLogRepository) {
        this.openRouterDal = openRouterDal;
        this.aiLogRepository = aiLogRepository;
    }

    public String generateResponse(String prompt){

        log.info("Prompt: " + prompt);

        String response = openRouterDal.sendPrompt(prompt);

        return response;
    }
}
