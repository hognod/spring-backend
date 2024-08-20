package com.hognod.backend.common.dto;

import com.sun.source.tree.ExpressionTree;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageRequestDto {
    @Schema(description = "Page Number", defaultValue = "1")
    private int page;
    @Schema(description = "Rows per page", defaultValue = "10")
    private int pageSize;
    @Schema(description = "정렬 Property", defaultValue = "")
    private String sort;
    @Schema(description = "정렬 방향 ASC or DESC", defaultValue = "")
    private String orderBy;

    @Schema(hidden = true)
    public int getOffset() {
        return (page - 1) * pageSize;
    }

    @Schema(hidden = true)
    public void setPagingInfo(ExportMode exportMode) {
        if (exportMode == ExportMode.All) {
            this.page = 1;
            this.pageSize = 100000;
        }
    }
}