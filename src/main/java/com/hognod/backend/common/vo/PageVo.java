package com.hognod.backend.common.vo;

import com.hognod.backend.common.dto.PageRequestDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class PageVo {
    @Schema(description = "Page number")
    private int page;
    @Schema(description = "Rows per page")
    private int pageSize;
    @Schema(description = "Total count")
    private int total;
    @Schema(description = "Total page count")
    private int totalPages;

    public PageVo(PageRequestDto pageRequestDto, int total) {
        this.page = pageRequestDto.getPage();
        this.pageSize = pageRequestDto.getPageSize();
        this.total = total;
        this.totalPages = total == 0 ? 0 : (int) Math.ceil((double) total / (double) pageSize);
    }
}