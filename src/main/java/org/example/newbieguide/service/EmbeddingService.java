package org.example.newbieguide.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmbeddingService {

    private final VectorStore vectorStore;

    public void saveEmbedding(String text){
        List<Document> documents = List.of(
            new Document(text)
        );
        vectorStore.add(documents);
    }
}
