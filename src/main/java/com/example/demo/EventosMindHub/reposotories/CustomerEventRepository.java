package com.example.demo.EventosMindHub.reposotories;

import com.example.demo.EventosMindHub.models.CustomerEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerEventRepository extends JpaRepository<CustomerEvent, Long> {
}
