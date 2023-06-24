package com.example.clubmanagement.repository.entity;

import lombok.Data;

@Data
public class ClubMembers {

    private int clubMemberId;
    private int userId;
    private int clubId;
    private String post;
}
