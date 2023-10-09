package org.example.domain.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ParkingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private int number;

    private int basement;

    private int dni;

    private User user;

    private int phone;

    public ParkingSpace(Long id, String email, int number, int basement, int dni, User user, int phone) {
        this.id = id;
        this.email = email;
        this.number = number;
        this.basement = basement;
        this.dni = dni;
        this.user = user;
        this.phone = phone;
    }

    public ParkingSpace() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBasement() {
        return basement;
    }

    public void setBasement(int basement) {
        this.basement = basement;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
