package com.example.builder.entities;

public class ArticleXML {
    
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.content;
    }
}
