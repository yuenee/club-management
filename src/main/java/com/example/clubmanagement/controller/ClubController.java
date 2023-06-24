package com.example.clubmanagement.controller;

import com.example.clubmanagement.repository.entity.Clubs;
import com.example.clubmanagement.service.ClubsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/club")
public class ClubController {
    private ClubsService clubsService;

    ClubController(ClubsService clubsService) {
        this.clubsService = clubsService;
    }

    @GetMapping("/list")
    public String getClubList() {
        List<Clubs> clubs = this.clubsService.getClubs();

        return "/club-list";
    }

    @GetMapping("/detail")
    public String getClubDetail() {
        return "/club-detail";
    }

    @GetMapping("/edit")
    public String getClubedit() {
        return "/club-edit";
    }
}
