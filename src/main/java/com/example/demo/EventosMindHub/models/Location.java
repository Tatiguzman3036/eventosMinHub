package com.example.demo.EventosMindHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.aspectj.weaver.ast.Var;

import java.util.Date;

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long event_id;
    private Character name;
    private Var location;
    private Integer capacity;
    private Var img;

    public Location() {
    }

    public Location(Character name, Var location, Integer capacity, Var img) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.img = img;
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

    public Var getLocation() {
        return location;
    }

    public void setLocation(Var location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Var getImg() {
        return img;
    }

    public void setImg(Var img) {
        this.img = img;
    }
}
