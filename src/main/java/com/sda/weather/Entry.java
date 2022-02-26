package com.sda.weather;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@NoArgsConstructor
@Table(name = "entry")
class Entry { // todo this is a proper name? I think it's a Location

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String city;
    private String country; // todo nullable?
    private String region;
    private float longitudeAndLatitdue; // todo we want to split this filed
    private Instant createdDate; // todo it is unnecessary, just remove it
}

