package com.green.board6.model;
import lombok.*;
@Getter
@Setter
@ToString
public class BoardGetOneRes {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
    private String createdAt;
}
