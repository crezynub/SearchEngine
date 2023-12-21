package searchengine.dto.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ErrorResponse extends DefaultResponse{
    private String error;

    public ErrorResponse() {
        super(false);
    }

    public static ErrorResponse getErrorMessage(String errorMessage){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setError(errorMessage);
        return errorResponse;
    }
}
