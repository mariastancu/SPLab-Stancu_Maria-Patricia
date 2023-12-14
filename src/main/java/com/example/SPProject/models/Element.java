package com.example.SPProject.models;

import com.example.SPProject.services.Visitor;

public interface Element {
    void print();
    void add(Element element);
    void remove(Element element);
    Element get(int id);
    void accept(Visitor v);
}