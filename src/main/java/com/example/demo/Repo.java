package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class Repo {
    public String getName(int id){
        return "Azamat";
    }
    public String getSurname(int id){
        return "Ordabekov";
    }
}
