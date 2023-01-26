package com.example.mapstructfootball.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private String nameTeam;

    private Integer founded;

    private String country;

    private Stadium stadium;
}
