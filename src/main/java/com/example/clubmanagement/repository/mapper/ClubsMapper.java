package com.example.clubmanagement.repository.mapper;

import com.example.clubmanagement.repository.entity.Clubs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClubsMapper {
    List<Clubs> findAll();
}
