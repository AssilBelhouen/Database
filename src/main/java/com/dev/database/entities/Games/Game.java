package com.dev.database.entities.Games;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "game_picture_url")
    private String gamePictureUrl;
    private  String title;
    private String genre;
    private String description;
    private String developer;
    private String publisher;
    private String platform; // to recheck
    private float rating;
    @OneToMany(mappedBy = "game",cascade = CascadeType.ALL)
    @Column(name = "review")
    private List<Review>Reviews;


}
