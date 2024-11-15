package com.green.board6;
import lombok.RequiredArgsConstructor;
import com.green.board6.model.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        return boardService.postBoard(p);
    }

    @GetMapping
    public List<BoardGetListRes> getBoardList() {
        return boardService.getBoardList();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes getBoardOne(@PathVariable int boardId) {
        return boardService.getBoardOne(boardId);
    }

    @PutMapping
    public int putBoard(@RequestBody BoardPutReq p) {
        return boardService.putBoard(p);
    }

    @DeleteMapping
    public int delBoard(BoardDelReq p) {
        return boardService.delBoard(p);
    }

}
