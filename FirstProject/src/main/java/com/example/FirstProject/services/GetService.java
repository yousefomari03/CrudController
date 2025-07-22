package com.example.FirstProject.services;

import org.springframework.stereotype.Service;

@Service
public class GetService {
    public String getservice(int id) {
        System.out.println("getservice"+" "+ id);
        if (id % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}
