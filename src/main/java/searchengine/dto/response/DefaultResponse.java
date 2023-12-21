package searchengine.dto.response;

import lombok.Data;

@Data
public class DefaultResponse {
    private boolean result;

    public DefaultResponse(boolean result){
        this.result = result;
    }
}
