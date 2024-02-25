package searchengine.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SiteRepo {
    @Autowired
    private SiteRepository siteRep;

    public static SiteRepository siteRepository;
@PostConstruct
    public void init() {
       siteRepository = siteRep;
    }
}
