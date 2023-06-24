package com.example.clubmanagement.service;

import com.example.clubmanagement.repository.entity.Clubs;
import com.example.clubmanagement.repository.mapper.ClubsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubsService {
    private final ClubsMapper clubsMapper;

    ClubsService(ClubsMapper clubsMapper) {
        this.clubsMapper = clubsMapper;
    }

    public List<Clubs> getClubs() {
        return clubsMapper.findAll();
    }
}
