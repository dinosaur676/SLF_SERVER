package com.example.framework.dto;

import com.example.slf.util.StringHelper;

public class SuccessRespDto extends ResponseDto {
    public SuccessRespDto() {
        this("성공");
    }

    public SuccessRespDto(Object data) {
        this(data, "성공");
    }

    public SuccessRespDto(String message) {
        this(null, message, "");
    }


    public SuccessRespDto(Object data, String message) {
        this(data, message, "");
    }

    public SuccessRespDto(Object data, String message, String info) {
        super();
        this.status = SUCCESS_CODE;
        this.data = data;
        this.message = StringHelper.isBlankString(message) ? FAIL_TEXT : message;
        this.info = info;
    }
}