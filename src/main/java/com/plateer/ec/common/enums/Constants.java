package com.plateer.ec.common.enums;

public enum Constants {
    SUCCESS_UPPER("SUCCESS"),
    SUCCESS_LOWER("success"),
    SUCCESS_CODE("0000"),
    FAIL_UPPER("FAIL"),
    FAIL_LOWER("fail"),
    Y("Y"),
    N("N");

    Constants(String code) {
        this.code = code;
    }

    private final String code;

    public String getCode() {
        return code;
    }
}
