package searchengine.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DefaultResponse {
    private boolean result;

    public DefaultResponse(boolean result){
        this.result = result;
    }
}
