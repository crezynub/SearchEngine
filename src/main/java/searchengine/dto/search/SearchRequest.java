package searchengine.dto.search;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SearchRequest {
    private String query;
    private String site;
    private int offset;
    private int limit;
}
