package com.ai.gemini_chat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class QnAService {
    //access to ApiKey and URL [gemini]
    @Value("${gemini.api.url}")
    private String geminiApiUrl;
    @Value("${gemini.api.key}")
    private String geminiApiKey;

    public String getAnswer(String question) {
        return "";
    }
}
