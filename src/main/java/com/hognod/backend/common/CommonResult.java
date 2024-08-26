package com.hognod.backend.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(description = "공통 Response")
public class CommonResult {
    @Schema(description = "result code")
    private int code;
    @Schema(description = "result message")
    private String message;
    private Object data;

    private CommonResult(CommonResultCode code) {
        this.code = code.getResultCode();
        this.message = code.getMessage();
    }

    private CommonResult(CommonResultCode code, Object data) {
        this.code = code.getResultCode();
        this.message = code.getMessage();
        this.data = data;
    }

    private CommonResult(CommonResultCode code, String message) {
        this.code = code.getResultCode();
        this.message = message;
    }



    public static CommonResult ok() {
        return new CommonResult(CommonResultCode.SUCCESS);
    }

    public static CommonResult data(Object data) {
        return new CommonResult(CommonResultCode.SUCCESS, data);
    }

    public static CommonResult error(CommonResultCode code) {
        return new CommonResult(code);
    }

    public static CommonResult error(CommonResultCode code, String message) {
        return new CommonResult(code, message);
    }

    public static CommonResult error(CommonResultCode code, Object data) {
        return new CommonResult(code, data);
    }
}