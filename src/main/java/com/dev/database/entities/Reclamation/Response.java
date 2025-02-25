package com.dev.database.entities.Reclamation;

import com.dev.database.entities.User.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
@Entity
public class Response implements Serializable {
    @Id
    private Long responseId;
    @Column(length = 500)
    private String content;
    @ManyToOne
    private Complain complain;
    @ManyToOne
    private User admin;
}
