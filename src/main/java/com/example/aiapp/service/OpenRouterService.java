package com.example.aiapp.service;

import com.example.aiapp.dal.OpenRouterDal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class OpenRouterService {

    private final OpenRouterDal openRouterDal;
    private static final Logger logger = LoggerFactory.getLogger(OpenRouterService.class);

    public OpenRouterService(OpenRouterDal openRouterDal) {
        this.openRouterDal = openRouterDal;
    }

    public String generateResponse(String prompt){

        String response = "";
        try {
            response = openRouterDal.sendPrompt(prompt);
            logger.info("Message INFO : Prompt: " + prompt);
            logger.warn("Message WARN : Prompt: " + prompt);

        }catch (Exception e){
            logger.error("Message ERROR : Prompt: " + prompt);
        }

        return response;
    }
}
