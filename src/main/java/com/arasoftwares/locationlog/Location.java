package com.arasoftwares.locationlog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public float latitude;
    public float longitude;
    public float speed;

    protected Location() {
    }

    @Override
    public String toString() {
        return String.format("Customer[id=%d, latitude='%f', longitude='%f,speed=%f']", id, latitude, longitude, speed);
    }

}