package com.example.demo.EventosMindHub.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class EventLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long eventLocation_id;
    private Date date;
    private Integer assistence;
    @OneToMany(mappedBy = "eventLocation", fetch = FetchType.EAGER)
    private Set<CustomerEvent> customerEvents = new HashSet<>();
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    private Event event;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "locaion_id")
    private Location location;

    public EventLocation() {
    }

    public EventLocation(Date date, Integer assistence) {
        this.date = date;
        this.assistence = assistence;
    }
    public Set<CustomerEvent> getCustomerEvents() {
        return customerEvents;
    }
    public void addCustomerEvent(CustomerEvent customerEvent){
        customerEvent.setEventLocation(this);
        customerEvents.add(customerEvent);
    }
    @JsonIgnore
    public Event getEvent(){return event;}
    public void setEvent(Event event){this.event = event;}
    @JsonIgnore
    public Location getLocation(){return location;}
    public void setLocation(Location location){this.location = location;}
    public long getEventLocation_id() {
        return eventLocation_id;
    }

    public void setEventLocation_id(long eventLocation_id) {
        this.eventLocation_id = eventLocation_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getAssistence() {
        return assistence;
    }

    public void setAssistence(Integer assistence) {
        this.assistence = assistence;
    }
}
