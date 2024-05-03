package com.example.demo.EventosMindHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.aspectj.weaver.ast.Var;

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long event_id;
    private Var desc;
    private Var img;
    private Short age_req;
    private Character name;

    public Event() {
    }

    public Event(Var desc, Var img, Short age_req, Character name) {
        this.desc = desc;
        this.img = img;
        this.age_req = age_req;
        this.name = name;
    }

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public Var getDesc() {
        return desc;
    }

    public void setDesc(Var desc) {
        this.desc = desc;
    }

    public Var getImg() {
        return img;
    }

    public void setImg(Var img) {
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
