package com.example.SPProject.models;


import com.example.SPProject.models.Element;
import com.example.SPProject.services.Visitor;
import lombok.Data;

@Data
public class Table implements Element{
    private String something;

    public Table(String something) {
        this.something = something;
    }

    public void print() {
        System.out.println("Something: " + something);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int id) {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}