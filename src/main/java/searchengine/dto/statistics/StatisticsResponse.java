package searchengine.dto.statistics;

import lombok.Data;
import lombok.EqualsAndHashCode;
import searchengine.dto.response.DefaultResponse;
@Data
@EqualsAndHashCode(callSuper = true)
public class StatisticsResponse extends DefaultResponse {
    private boolean result;
    private StatisticsData statistics;

    public StatisticsResponse(){
        super(true);
    }
}
