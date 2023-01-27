package com.example.mapstructfootball.mapper;

import com.example.mapstructfootball.dto.Team;
import com.example.mapstructfootball.entity.Response;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    @Mapping(target = "nameTeam",expression = "java(response.getTeamInfo().getNameTeam())")
    @Mapping(target = "founded",expression = "java(response.getTeamInfo().getFounded())")
    @Mapping(target = "country",expression = "java(response.getTeamInfo().getCountry())")
    @Mapping(target = "stadium.nameStadium",expression = "java(response.getStadiumInfo().getNameStadium())")
    @Mapping(target = "stadium.capacity",expression = "java(response.getStadiumInfo().getCapacity())")
    @Mapping(target = "stadium.city",expression = "java(response.getStadiumInfo().getCity())")
    @Mapping(target = "stadium.address",expression = "java(response.getStadiumInfo().getAddress())")
    Team convert(Response response);
}
