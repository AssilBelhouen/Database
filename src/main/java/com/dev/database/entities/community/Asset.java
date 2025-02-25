package com.dev.database.entities.community;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Asset implements Serializable {

    @Id
    private Long assetId;
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    private String asset_url;


}
