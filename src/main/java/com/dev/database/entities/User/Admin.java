package com.dev.database.entities.User;

import com.dev.database.entities.cloud.Image;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Admin extends User{
    @Column(name = "admin_permission")
    private String permissions;
    @OneToMany(mappedBy = "uploader",cascade = CascadeType.ALL,orphanRemoval = true)
    @Column(name = "uploaded_images")
    private Set<Image> uploadedImages;
}
