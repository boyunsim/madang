package com.green.board6;

import com.green.board6.model.*;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardGetListRes> getBoardList();
    BoardGetOneRes getBoardOne(int p);
    int putBoard(BoardPutReq p);
    int delBoard(BoardDelReq p);
}
