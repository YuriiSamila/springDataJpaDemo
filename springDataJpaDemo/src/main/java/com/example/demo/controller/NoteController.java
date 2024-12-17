package com.example.demo.controller;

import com.example.demo.dto.NoteDto;
import com.example.demo.entity.Note;
import com.example.demo.repository.NoteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Objects.requireNonNull;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = requireNonNull(noteRepository);
    }

    @GetMapping
    public List<NoteDto> getNotes(Pageable pageable) {
        return noteRepository.findAllNoteDtos();
    }

}
