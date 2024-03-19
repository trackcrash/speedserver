package com.cool.pink.spdsever.controller;

import com.cool.pink.spdsever.dto.CreateBoardDto;
import com.cool.pink.spdsever.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/board")
public class BoardApiController {
    private final BoardService boardService;


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CreateBoardDto createBoardDto){
        return boardService.save(createBoardDto);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        return boardService.getAll();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getBoard(@PathVariable Long id){
        return boardService.getBoard(id);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateBoard(@RequestBody CreateBoardDto createBoardDto){
        return boardService.updateBoard(createBoardDto);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable Long id){
        return boardService.deleteBoard(id);
    }
}
