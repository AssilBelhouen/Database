package com.dev.database.entities.Marketplace;

import com.dev.database.entities.Games.Game;
import com.dev.database.entities.User.Client;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long arcticleId;
    private float price;
    @OneToMany
    private List<Game>games;
    @ManyToOne
    @JoinColumn(name = "renter_id",nullable = false,updatable = false)
    private Client renter;
    @ManyToMany
    @JoinTable(
            name = "buyers",
            joinColumns = @JoinColumn(name = "renter_id"),
            inverseJoinColumns = @JoinColumn(name = "buyer_id")
    )
    private List<Client>buyers;

}
