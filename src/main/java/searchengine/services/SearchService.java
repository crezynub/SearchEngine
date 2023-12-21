package searchengine.services;

import searchengine.dto.response.DefaultResponse;
import searchengine.dto.search.SearchRequest;

public interface SearchService {
    DefaultResponse search(SearchRequest request);
}
