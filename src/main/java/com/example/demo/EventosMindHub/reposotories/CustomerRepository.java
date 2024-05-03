package com.example.demo.EventosMindHub.reposotories;

import com.example.demo.EventosMindHub.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
