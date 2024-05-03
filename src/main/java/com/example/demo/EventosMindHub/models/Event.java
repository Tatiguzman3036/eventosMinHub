package com.example.demo.EventosMindHub.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.aspectj.weaver.ast.Var;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long event_id;
    private char desc;
    private char img;
    private Short age_req;
    private Character name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organizer_id")
    private Customer customer;
    @OneToMany(mappedBy = "event",fetch = FetchType.EAGER)
    private Set<Comment> comments = new HashSet<>();
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)
    private Set<EventLocation> eventLocations = new HashSet<>();
    public Event() {
    }

    public Event(char desc, char img, Short age_req, Character name) {
        this.desc = desc;
        this.img = img;
        this.age_req = age_req;
        this.name = name;
    }
    @JsonIgnore
    public Customer getCustomer() { return customer; }

    public void setCustomer(Customer customer) { this.customer = customer; }

    public Set<Comment> getComments() {
        return comments;
    }
    public void addComments (Comment comment){
        comment.setEvent(this);
        comments.add(comment);
    }
    public Set<EventLocation> getEventLocations() {
        return eventLocations;
    }
    public void addEventLocation (EventLocation eventLocation){
        eventLocation.setEvent(this);
        eventLocations.add(eventLocation);
    }

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public char getDesc() {
        return desc;
    }

    public void setDesc(char desc) {
        this.desc = desc;
    }

    public char getImg() {
        return img;
    }

    public void setImg(char img) {
        this.img = img;
    }

    public Short getAge_req() {
        return age_req;
    }

    public void setAge_req(Short age_req) {
        this.age_req = age_req;
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }
}
