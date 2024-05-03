package com.example.demo.EventosMindHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CustomerEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long userEvent_id;

}
