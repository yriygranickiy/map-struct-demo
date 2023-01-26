package com.example.mapstructfootball.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamInfo {

    private String nameTeam;

    private Integer founded;

    private String country;

    private StadiumInfo stadiumInfo;

}
