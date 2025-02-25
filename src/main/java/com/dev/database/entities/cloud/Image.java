package com.dev.database.entities.cloud;

import com.dev.database.entities.User.Admin;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Image implements Serializable {

    @Id
    @Column(name = "image_id",nullable = false, updatable = false)
    private String id_image;
    @ManyToOne
    @JoinColumn(name = "uploader_id",nullable = false,updatable = false)
    private Admin uploader;



}
