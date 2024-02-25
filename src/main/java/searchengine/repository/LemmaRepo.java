package searchengine.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LemmaRepo {
    @Autowired
    private LemmaRepository lemmaRep;

    public static LemmaRepository lemmaRepository;
    @PostConstruct
    public void init() {
        lemmaRepository = lemmaRep;
    }
}
