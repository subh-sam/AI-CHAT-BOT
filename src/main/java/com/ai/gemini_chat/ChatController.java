package com.ai.gemini_chat;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/chat")
public class ChatController {
    @PostMapping("/message")
    public Mono<String> chat(@RequestBody String userMessage) {
        return Mono.fromSupplier(()->{
            return "AI Response to: " +userMessage;
        });
    }
}
