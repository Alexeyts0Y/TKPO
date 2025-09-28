package com.example.builder.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.example.builder.entities.ArticleXML;

public class XMLArticleBuilder implements ArticleBuilder {

    private final ArticleXML article;
    private final StringBuilder content;
    private String hash;

    public XMLArticleBuilder() {
        this.article = new ArticleXML();
        this.content = new StringBuilder();
    }

    @Override
    public void buildTitle(String title) {
        this.content.append("<title>").append(escapeXML(title)).append("</title>\n");
    }

    @Override
    public void buildAuthors(String authors) {
        this.content.append("<authors>").append(escapeXML(authors)).append("</authors>\n");
    }

    @Override
    public void buildContent(String content) {
        this.content.append("<body>").append(escapeXML(content)).append("</body>\n");
    }

    @Override
    public void buildHash(String hash) {
        this.hash = hash;
    }

    @Override
    public ArticleXML getResult() {
        String fullXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<article>\n" + 
                         content.toString() + "</article>";
        article.setContent(fullXML);
        return article;
    }

    @Override
    public boolean verifyHash() {
        try {
            String contentText = content.toString()
            .replace("<title>", "")
            .replace("</title>", "")
            .replace("<authors>", "")
            .replace("</authors>", "")
            .replace("<body>", "")
            .replace("</body>", "")
            .replace("\n", "")
            .trim();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(contentText.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString().equals(hash);
        } catch (NoSuchAlgorithmException e) {
            return false;
        }
    }
    
    private String escapeXML(String text) {
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;")
                   .replace("\"", "&quot;")
                   .replace("'", "&apos;");
    }
}
