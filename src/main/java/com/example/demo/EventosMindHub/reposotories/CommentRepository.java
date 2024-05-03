package com.example.demo.EventosMindHub.reposotories;

import com.example.demo.EventosMindHub.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
