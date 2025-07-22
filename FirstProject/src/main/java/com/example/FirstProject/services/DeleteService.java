package com.example.FirstProject.services;

import org.springframework.stereotype.Service;

@Service
public class DeleteService {
    public String deleteservice(int id) {
        return "Delete Services"+" "+"id="+ id ;
    }
}
