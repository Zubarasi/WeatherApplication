package com.sda.weather;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.Instant;

import static javax.persistence.GenerationType.IDENTITY;

    @Data
    @Entity
    @Table(name = "entry")
    class Entry {

        @Id
        @GeneratedValue(strategy = IDENTITY)
        private Long id;
        private String city;
        private String country;
        private String region;
        private float longitudeAndLatitdue;
        private Instant createdDate;
    }

