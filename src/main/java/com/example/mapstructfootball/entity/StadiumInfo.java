package com.example.mapstructfootball.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StadiumInfo {

    private String nameStadium;

    private int capacity;

    private String city;

    private String address;
}
