package com.example.mapstructfootball.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stadium {

    private String nameStadium;

    private Integer capacity;

    private String city;

    private String address;
}
