package com.example.demo.EventosMindHub.models;

import jakarta.persistence.*;
import org.aspectj.weaver.ast.Var;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long event_id;
    private Character name;
    private Character location;
    private Integer capacity;
    private Character img;
    @OneToMany(mappedBy = "location", fetch = FetchType.EAGER)
    private Set<EventLocation> eventLocations = new HashSet<>();

    public Location() {
    }

    public Location(Character name, Character location, Integer capacity, Character img) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.img = img;
    }
    public Set<EventLocation> getEventLocations() {
        return eventLocations;
    }
    public void addEventLocation(EventLocation eventLocation){
        eventLocation.setLocation(this);
        eventLocations.add(eventLocation);
    }

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public Character getLocation() {
        return location;
    }

    public void setLocation(Character location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Character getImg() {
        return img;
    }

    public void setImg(Character img) {
        this.img = img;
    }
}
