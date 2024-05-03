package com.example.demo.EventosMindHub.reposotories;

import com.example.demo.EventosMindHub.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
