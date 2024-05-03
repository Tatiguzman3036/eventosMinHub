package com.example.demo.EventosMindHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long comment_id;
    private Character comment;

    public Comment() {
    }

    public Comment(Character comment) {
        this.comment = comment;
    }
}
