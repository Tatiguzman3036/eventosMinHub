package com.example.demo.EventosMindHub.reposotories;

import com.example.demo.EventosMindHub.models.EventLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLocationRespository extends JpaRepository<EventLocation, Long> {
}
