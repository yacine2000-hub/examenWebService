package com.groupeisi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class HistoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    // Getters and setters
}
