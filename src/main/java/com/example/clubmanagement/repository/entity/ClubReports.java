package com.example.clubmanagement.repository.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClubReports {

    private int reportId;
    private int clubId;
    private String createMember;
    private String activeMember;
    private LocalDate activeDate;
    private String activeName;
    private String activeGoal;
    private String activePlan;
    private String activeResult;
    private String improvement;
    private String message;
    private String picture;

}
