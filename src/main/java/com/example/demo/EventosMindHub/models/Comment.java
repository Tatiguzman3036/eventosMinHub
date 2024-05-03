package com.example.demo.EventosMindHub.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long comment_id;
    private Character comment;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Customer customer;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event_id")
    private Event event;

    public Comment() {
    }

    public Comment(Character comment) {
        this.comment = comment;
    }
    @JsonIgnore
    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }
    @JsonIgnore
    public Event getEvent(){return event;}
    public void setEvent(Event event){this.event = event;}

    public long getComment_id() {
        return comment_id;
    }

    public void setComment_id(long comment_id) {
        this.comment_id = comment_id;
    }

    public Character getComment() {
        return comment;
    }

    public void setComment(Character comment) {
        this.comment = comment;
    }
}
