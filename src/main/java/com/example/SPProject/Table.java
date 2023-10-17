package com.example.SPProject;

import lombok.Data;

@Data
public class Table implements Element{
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Title: " + title);
    }
}
