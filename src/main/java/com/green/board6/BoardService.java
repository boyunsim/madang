package com.green.board6;
import lombok.RequiredArgsConstructor;
import com.green.board6.model.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper boardmapper;

    public int postBoard(BoardPostReq p) {
        return boardmapper.postBoard(p);
    }

    public List<BoardGetListRes> getBoardList() {
        return boardmapper.getBoardList();
    }

    public BoardGetOneRes getBoardOne(int p) {
        return boardmapper.getBoardOne(p);
    }

    public int putBoard(BoardPutReq p) {
        return boardmapper.putBoard(p);
    }

    public int delBoard(BoardDelReq p) {
        return boardmapper.delBoard(p);
    }
}