package com.example.demo.EventosMindHub.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class CustomerEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long userEvent_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Customer customer;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    private EventLocation eventLocation;
    public CustomerEvent() {
    }
    @JsonIgnore
    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }
    @JsonIgnore
    public EventLocation getEventLocation(){return eventLocation;}
    public void setEventLocation(EventLocation eventLocation){this.eventLocation = eventLocation;}
    public long getUserEvent_id() {
        return userEvent_id;
    }

    public void setUserEvent_id(long userEvent_id) {
        this.userEvent_id = userEvent_id;
    }
}
