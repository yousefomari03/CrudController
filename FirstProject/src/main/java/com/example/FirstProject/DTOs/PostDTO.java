package com.example.FirstProject.DTOs;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PostDTO {
    private String name;
    private int age;

    @Override
    public String   toString() {
        return "PostDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public PostDTO(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
