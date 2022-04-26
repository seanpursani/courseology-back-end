package com.nology;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private int price;
    private String duration;
    private String summary;

    public Course(String name, String location, int price, String duration, String summary) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.duration = duration;
        this.summary = summary;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", duration='" + duration + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
