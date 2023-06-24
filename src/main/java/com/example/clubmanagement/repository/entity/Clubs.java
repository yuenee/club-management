package com.example.clubmanagement.repository.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Clubs {

    private int clubId;
    private String clubName;
    private LocalDate requestDate;
    private String requestName;
    private int requestMember;
    private String club_concept;
    private String club_content;

}
