package com.example.FirstProject.DTOs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PutDTO {
    private int id;
    private String firstName;

    public PutDTO(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
}
