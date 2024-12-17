package com.example.demo.repository;

import com.example.demo.dto.NoteDto;
import com.example.demo.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query("select new com.example.demo.dto.NoteDto(n.body, p.name, p.age) from Note n inner join n.person p")
    List<NoteDto> findAllNoteDtos();

}
