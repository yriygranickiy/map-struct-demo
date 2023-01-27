package com.example.mapstructfootball.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    private TeamInfo teamInfo;

    private StadiumInfo stadiumInfo;

}
