package com.dev.database.entities.User;

import com.dev.database.entities.Games.Subscription;
import com.dev.database.entities.cloud.Instance;
import com.dev.database.entities.cloud.Storage;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Client extends User{
    @Column(name = "client_type")
    private String clientType;

    @Column(name = "loyalty_points",columnDefinition = "int default 0")
    private int loyaltyPoints;
    private long credit; // recheck

    @OneToMany(mappedBy = "client",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Subscription>subscriptions=new ArrayList<>();
    @OneToMany(mappedBy = "Tenant",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Instance> sessions=new ArrayList<>();
    @OneToMany(mappedBy = "player",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Storage>saves=new ArrayList<>();
}
