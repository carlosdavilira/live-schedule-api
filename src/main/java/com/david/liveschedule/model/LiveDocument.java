package com.david.liveschedule.model;

import com.sun.istack.NotNull;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="live_document")
public class LiveDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Column(name="live_name")
    private String liveName;
    @NotNull
    @Column(name="live_channel")
    private String channelName;

    private LocalDateTime liveDate;
    private String liveLink;
    private LocalDateTime registrationDate;



}
