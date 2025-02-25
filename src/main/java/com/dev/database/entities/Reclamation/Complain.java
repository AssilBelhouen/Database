package com.dev.database.entities.Reclamation;

import com.dev.database.entities.User.Client;
import com.dev.database.entities.User.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
@Entity
public class Complain implements Serializable {
    @Id
    private long reclamation;
    private boolean Status;
    @Column(length = 500)
    private String description;
    @ManyToOne
    private User claimant;
}
