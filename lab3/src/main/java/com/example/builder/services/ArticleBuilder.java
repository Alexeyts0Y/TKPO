package com.example.builder.services;

import com.example.builder.entities.ArticleXML;

public interface ArticleBuilder {
    
    void buildTitle(String title);
    void buildAuthors(String authors);
    void buildContent(String content);
    void buildHash(String hash);
    ArticleXML getResult();
    boolean verifyHash();
}
