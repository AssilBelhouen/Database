package com.dev.database.entities.Games;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Pack implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pack_id")
    private Long id;
    @Column(nullable = false)
    private String packName;
    @Column(length = 1000)
    private String description;
    @ManyToMany
    @JoinTable(
            name = "pack_games",
            joinColumns = @JoinColumn(name = "pack_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id")
    )
    private List<Game> games;
    @ManyToOne
    @JoinColumn(name = "promoted_game_id")
    private Game promoted_game;
    @Temporal(TemporalType.DATE)
    private Date availableDate;
    @Temporal(TemporalType.DATE)
    private Date expirationDate;

}
