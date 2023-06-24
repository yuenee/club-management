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
    private String clubConcept;
    private String clubContent;

}
