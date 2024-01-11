package com.example.SPProject.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import com.example.SPProject.services.Visitor;

@Data
@Entity
public class Table extends BaseElement{
    @Id
    private int id;
    private String something;

    public Table(String something) {
        this.something = something;
    }

    public Table() {

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