package com.marcos.restapi.rest.error;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentErrorResponse {

    private int status;
    private String message;
    private long timeStamp;
}
