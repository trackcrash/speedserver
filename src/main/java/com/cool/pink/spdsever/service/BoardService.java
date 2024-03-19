package com.cool.pink.spdsever.service;

import com.cool.pink.spdsever.dto.CreateBoardDto;
import com.cool.pink.spdsever.model.Board;
import com.cool.pink.spdsever.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public ResponseEntity<CreateBoardDto> save(CreateBoardDto createBoardDto) {
        Board board = Board.builder()
                .id(createBoardDto.getId())
                .postTitle(createBoardDto.getPostTitle())
                .postWriter(createBoardDto.getPostWriter())
                .postDate(createBoardDto.getPostDate())
                .postView(createBoardDto.getPostView())
                .postCategory(createBoardDto.getPostCategory())
                .postContent(createBoardDto.getPostContent())
                .build();
        boardRepository.save(board);
        return ResponseEntity.ok(createBoardDto);
    }

    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(boardRepository.findAll());
    }

    public ResponseEntity<?> getBoard(Long id) {
        return ResponseEntity.ok(boardRepository.findById(id));
    }

    public ResponseEntity<?> updateBoard(CreateBoardDto createBoardDto) {
        Board board = Board.builder()
                .id(createBoardDto.getId())
                .postTitle(createBoardDto.getPostTitle())
                .postWriter(createBoardDto.getPostWriter())
                .postDate(createBoardDto.getPostDate())
                .postView(createBoardDto.getPostView())
                .postCategory(createBoardDto.getPostCategory())
                .postContent(createBoardDto.getPostContent())
                .build();
        boardRepository.save(board);
        return ResponseEntity.ok(createBoardDto);
    }

    public ResponseEntity<?> deleteBoard(Long id) {
        boardRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
