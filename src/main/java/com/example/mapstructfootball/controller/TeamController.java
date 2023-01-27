package com.example.mapstructfootball.controller;


import com.example.mapstructfootball.dto.Team;
import com.example.mapstructfootball.entity.Response;
import com.example.mapstructfootball.entity.StadiumInfo;
import com.example.mapstructfootball.entity.TeamInfo;
import com.example.mapstructfootball.mapper.TeamMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @GetMapping("/team")
    public Team getTeam(){
        StadiumInfo stadium = new StadiumInfo("Anfield",55212,"Liverpool","Anfield Road");
        TeamInfo team = new TeamInfo("Liverpool",1892,"England");
        Response response = new Response(team,stadium);


        return TeamMapper.INSTANCE.convert(response);
    }
}
