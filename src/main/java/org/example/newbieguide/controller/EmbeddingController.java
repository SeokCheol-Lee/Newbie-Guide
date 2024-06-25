package org.example.newbieguide.controller;

import lombok.RequiredArgsConstructor;
import org.example.newbieguide.service.EmbeddingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmbeddingController {

    private final EmbeddingService embeddingService;

    @PostMapping("/embedding")
    public void EmbeddingData(@RequestBody String text) {
        embeddingService.saveEmbedding(text);
    }
}
