package com.dev.database.entities.cloud;

import com.dev.database.entities.User.Admin;
import com.dev.database.entities.User.Client;
import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Instance implements Serializable {
    @Id
    //@Column(name = "instance_id",nullable = false, updatable = false)
    private String instanceId;
    @ManyToOne
    @JoinColumn(name = "id_image",nullable = false)
    private Image image;
    @ManyToOne
    @JoinColumn(name = "id_Tenant",nullable = false,updatable = false)
    private Client Tenant;
    @OneToOne
    @JoinColumn(name = "progress")
    private Storage save;

}
