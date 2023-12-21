package searchengine.dto.statistics;

import lombok.Data;
import lombok.EqualsAndHashCode;
import searchengine.dto.response.DefaultResponse;

@EqualsAndHashCode(callSuper = true)
@Data
public class StatisticsResponse extends DefaultResponse {
    private boolean result;
    private StatisticsData statistics;

    public StatisticsResponse(){
        super(true);
    }
}
