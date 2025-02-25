package com.dev.database.entities.cloud;

import com.dev.database.entities.User.Client;
import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Storage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "storage_id")
    private Long storageId;
    @Column(name = "played_Hours")
    private Double playedHours;
    @Column(name = "file_Name")
    private String fileName;
    @ManyToOne
    @JoinColumn(name = "player_id",nullable = false,updatable = true) // marketstore share progress
    private Client player;

} //to rethink about it
