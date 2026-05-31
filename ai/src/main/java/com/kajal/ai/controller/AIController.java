package com.kajal.ai.controller;

import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AIController {

    private OpenAiChatModel chatModel;

    public AIController(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }
    @GetMapping("/{topic}")
    public ResponseEntity<String> getJoke(@PathVariable String topic){
        String call = chatModel.call(topic);
        return ResponseEntity.ok().body(call);
    }
}
