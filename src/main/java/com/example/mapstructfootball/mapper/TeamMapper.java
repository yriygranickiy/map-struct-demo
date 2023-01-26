package com.example.mapstructfootball.mapper;

import com.example.mapstructfootball.dto.Team;
import com.example.mapstructfootball.entity.TeamInfo;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    @Mapping(target = "nameStadium",expression = "java(stadiumInfo.getNameStadium())")
    @Mapping(target = "capacity",expression = "java(stadiumInfo.getCapacity())")
    @Mapping(target = "city",expression = "java(stadiumInfo.getCity())")
    @Mapping(target = "address",expression = "java(stadiumInfo.getAddress())")
    Team convert(TeamInfo teamInfo);
}
