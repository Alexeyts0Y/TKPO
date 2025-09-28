package com.example.builder.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.example.builder.entities.ArticleXML;

public class ArticleService {
    
    public ArticleXML processTXT(String text, ArticleBuilder builder) throws NoSuchAlgorithmException {
        String[] lines = text.split("\n");

        if (lines.length < 3) {
            throw new IllegalArgumentException("Invalid TXT format");
        }

        builder.buildTitle(lines[0]);
        builder.buildAuthors(lines[1]);

        StringBuilder content = new StringBuilder();
        for (int i = 2; i < lines.length; i++) {
            content.append(lines[i]);
            if (i < lines.length - 2) content.append("\n");
        }

        builder.buildContent(content.toString());
        builder.buildHash(generateHash(text));

        if (!builder.verifyHash()) {
            throw new SecurityException("Hash verufucation failed");
        }

        return builder.getResult();
    }
    
    public String generateHash(String content) throws NoSuchAlgorithmException {
        String contentText = content
                .replace("\n", "")
                .trim();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(contentText.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
