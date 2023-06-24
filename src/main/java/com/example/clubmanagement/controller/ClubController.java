package com.example.clubmanagement.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.clubmanagement.repository.entity.Clubs;
import com.example.clubmanagement.service.ClubsService;

@Controller
@RequestMapping("/club")
public class ClubController {
    private ClubsService clubsService;

    ClubController(ClubsService clubsService) {
        this.clubsService = clubsService;
    }

    @GetMapping("/list")
    public String getClubList(Model model) {
        List<Clubs> clubs = this.clubsService.getClubs();
        Clubs club = new Clubs();
        club.setClubName("太郎");
        clubs.add(club);
        club.setClubName("二郎");
        clubs.add(club);
        club.setClubName("三郎");
        clubs.add(club);
        model.addAttribute("clubs",clubs);

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
