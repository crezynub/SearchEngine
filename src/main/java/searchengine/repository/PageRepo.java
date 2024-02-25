package searchengine.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PageRepo {
    @Autowired
    private PageRepository pageRep;
    public static PageRepository pageRepository;
    @PostConstruct
    public void init() {
        pageRepository = pageRep;
    }
}
