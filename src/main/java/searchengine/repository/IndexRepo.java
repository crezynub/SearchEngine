package searchengine.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexRepo {
    @Autowired
    private IndexRepository indexRep;

    public static IndexRepository indexRepository;
    @PostConstruct
    public void init(){
       indexRepository = indexRep;
    }
}
