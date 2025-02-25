package com.dev.database.entities.community;

import com.dev.database.entities.User.User;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Community implements Serializable {

    @Id
    private Long id;
    private String Title;
    @Column(length = 1000)
    private  String Description;
    @Column(name = "image_url")
    private String imageUrl;
    private int member;
    @ManyToMany
    @JoinTable(
            name = "Community_admin",
            joinColumns = @JoinColumn(name = "community_id"),
            inverseJoinColumns = @JoinColumn(name = "admin_id")
    )
    private List<User>admins;
    @ManyToMany
    @JoinTable(
            name = "community_member",
            joinColumns = @JoinColumn(name = "community_id"),
            inverseJoinColumns = @JoinColumn(name = "member_id")
    )
    private List<User>members;
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @OneToMany
    @Column(name = "Post_id")
    private List<Post>Posts;


}
