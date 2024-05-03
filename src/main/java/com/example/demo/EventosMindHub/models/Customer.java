package com.example.demo.EventosMindHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
