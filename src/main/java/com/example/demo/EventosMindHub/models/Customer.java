package com.example.demo.EventosMindHub.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    private long customer_id;
    private String firstName;
    private String lastName;
    private String email;
    private Character password;
    private Boolean activated;
    private Short edad;
    private GenereType genereType;
    private RolType rolType;
    @OneToMany (mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<CustomerEvent> customerEvents = new HashSet<>();
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<Comment> comments = new HashSet<>();
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private Set<Event> events = new HashSet<>();

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, Character password, Boolean activated, Short edad, GenereType genereType, RolType rolType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.activated = activated;
        this.edad = edad;
        this.genereType = genereType;
        this.rolType = rolType;
    }

    public Set<CustomerEvent> getCustomerEvents() {
        return customerEvents;
    }
    public void addCustomerEvent (CustomerEvent customerEvent){
        customerEvent.setCustomer(this);
        customerEvents.add(customerEvent);
    }
    public Set<Comment> getComments() {
        return comments;
    }
    public void addComments(Comment comment){
        comment.setCustomer(this);
        comments.add(comment);
    }
    public Set<Event> getEvents() {
        return events;
    }

    public void addEvents (Event event){
        event.setCustomer(this);
        events.add(event);
    }
    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getPassword() {
        return password;
    }

    public void setPassword(Character password) {
        this.password = password;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public GenereType getGenereType() {
        return genereType;
    }

    public void setGenereType(GenereType genereType) {
        this.genereType = genereType;
    }

    public RolType getRolType() {
        return rolType;
    }

    public void setRolType(RolType rolType) {
        this.rolType = rolType;
    }
}
