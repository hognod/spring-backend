package com.hognod.backend.common;

import lombok.Getter;

@Getter
public enum CommonResultCode {
    SUCCESS(200, "success"),
    BAD_REQUEST(400, "bad request"),
    RESOURCE_NOT_FOUND(404, "requested resource cloud not be found"),
    INTERNAL_SERVER_ERROR(500, "there was a problem with data processing, contact the administrator.");

    private final int resultCode;
    private final String message;

    private CommonResultCode(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public CommonResultCode ok() {
        return SUCCESS;
    }
}