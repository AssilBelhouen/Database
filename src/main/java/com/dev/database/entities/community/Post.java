package com.dev.database.entities.community;

import com.dev.database.entities.User.User;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Post implements Serializable {
    @Id
    private Long postId;
    private String Title;
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Column(length = 1000)
    private String Content;
    @ManyToMany
    @JoinTable(
            name = "reacts",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private List<User> interactedusers;
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @Column(name = "asset_id")
    private List<Asset>assets=new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "publisher")
    private User publicher;


}
