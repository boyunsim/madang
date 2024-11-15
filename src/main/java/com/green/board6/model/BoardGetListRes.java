package com.green.board6.model;
import lombok.*;
@Getter
@Setter
@ToString
public class BoardGetListRes {
    private int boardId;
    private String title;
    private String writer;
    private String createdAt;
}
