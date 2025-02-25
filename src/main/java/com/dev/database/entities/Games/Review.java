package com.dev.database.entities.Games;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Review implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float rate;
    private String title;
    @Column(length = 1000)
    private String description;
    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;
}
