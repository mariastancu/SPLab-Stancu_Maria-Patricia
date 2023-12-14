package com.example.SPProject.services;

import com.example.SPProject.models.Context;
import com.example.SPProject.models.Paragraph;

public interface AlignStrategy {
    public void render(Paragraph paragraph, Context context);
}
