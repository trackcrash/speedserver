package com.cool.pink.spdsever.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class CreateBoardDto {
    private Long id;
    private String postTitle;
    private String postWriter;
    private String postDate;
    private String postView;
    private String postCategory;
    private String postContent;

    @Builder
    public CreateBoardDto(Long id, String postTitle, String postWriter, String postDate, String postView, String postCategory, String postContent) {
        this.id = id;
        this.postTitle = postTitle;
        this.postWriter = postWriter;
        this.postDate = postDate;
        this.postView = postView;
        this.postCategory = postCategory;
        this.postContent = postContent;
    }

}
