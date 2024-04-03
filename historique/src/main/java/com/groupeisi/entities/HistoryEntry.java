package com.groupeisi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class HistoryEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "day_of_week")
    private String dayOfWeek;

    // Getters and setters
}
