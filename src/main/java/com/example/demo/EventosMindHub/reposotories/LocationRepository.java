package com.example.demo.EventosMindHub.reposotories;

import com.example.demo.EventosMindHub.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
