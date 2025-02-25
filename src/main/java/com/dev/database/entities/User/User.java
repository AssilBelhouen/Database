package com.dev.database.entities.User;

import com.dev.database.entities.community.Community;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long userId;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private  String password;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(name = "profile_picture_url")
    private String profilePictureUrl;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date Birthday;
    @Temporal(TemporalType.DATE)
    @Column(name = "account_creation_date", nullable = false, updatable = false)
    private Date accountCreationDate;

    @ManyToMany(mappedBy = "admins")
    private Set<Community> adminCommunities;
    @ManyToMany(mappedBy = "members")
    private Set<Community> joinedCommunities;

}
