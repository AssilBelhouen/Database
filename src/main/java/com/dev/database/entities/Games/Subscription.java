package com.dev.database.entities.Games;

import com.dev.database.entities.User.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subscription")
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "starting_Date",nullable = false)
    private Date startingDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "expiration_Date",nullable = false)
    private Date expirationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "subscription_type")
    private  TypeSubscription subscriptionType;

    @ManyToOne
    @JoinColumn(name = "pack_id")
    private Pack pack;
    @ManyToOne
    @JoinColumn(name = "client_id",nullable = false)
    private Client client;

}
