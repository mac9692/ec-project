package com.plateer.ec.common.entity.response;

import com.plateer.ec.common.enums.Constants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response <T> {
    private String message = Constants.SUCCESS_UPPER.getCode();
    private String code = Constants.SUCCESS_CODE.getCode();
    private T data;
}
