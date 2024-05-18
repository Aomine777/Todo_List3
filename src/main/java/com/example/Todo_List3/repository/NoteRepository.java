package com.example.Todo_List3.repository;

import com.example.Todo_List3.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
