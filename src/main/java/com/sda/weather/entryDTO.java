package com.sda.weather;

import lombok.Data;

@Data
class EntryDTO {
    private Long id;
    private String city;
    private String country;
    private String region;
    private float longitudeAndLatitdue;
}