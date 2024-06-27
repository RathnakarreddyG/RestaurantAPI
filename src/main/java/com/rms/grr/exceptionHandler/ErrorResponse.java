package com.rms.grr.exceptionHandler;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorResponse {

    private String guid;

    private String status_code;

    private String error_message;

    private Date time_stamp;

}
