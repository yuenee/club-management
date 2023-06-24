package com.example.clubmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.clubmanagement.repository.entity.Clubs;
import com.example.clubmanagement.repository.mapper.ClubMapper;

@Service
public class ClubsService {
	private final ClubMapper clubMapper;

	ClubsService(ClubMapper clubsMapper) {
		this.clubMapper = clubsMapper;
	}

	public List<Clubs> getClubs() {
		return clubMapper.selectAllClubs();
	}
}
