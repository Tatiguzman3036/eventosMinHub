package com.example.demo.EventosMindHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class EventLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long eventLocation_id;
    private Date date;
    private Integer assistence;

    public EventLocation() {
    }

    public EventLocation(Date date, Integer assistence) {
        this.date = date;
        this.assistence = assistence;
    }

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
