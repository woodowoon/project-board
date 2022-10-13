package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title; // 제목
    private String content; // 게시글 내용
    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 게시글 생성 날짜
    private String createdBy; // 게시글 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
