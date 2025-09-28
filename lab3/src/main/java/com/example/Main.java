package com.example;

import com.example.abstract_factory.factories.EnglishFilmFactory;
import com.example.abstract_factory.factories.RussianFilmFactory;
import com.example.abstract_factory.services.FilmOrder;
import com.example.builder.entities.ArticleXML;
import com.example.builder.services.ArticleService;
import com.example.builder.services.XMLArticleBuilder;
import com.example.factory.entities.TetrisShape;
import com.example.factory.services.RandomShapeGenerator;

public class Main {
    public static void main(String[] args) {
        checkBuilder();
        checkAbstractFactory();
        checkFactory();
    }

    

    public static void checkBuilder() {
        String txtContent = "Важность паттернов проектирования\n" +
                           "Иванов Петров Сидоров\n" +
                           "Паттерны проектирования являются важным инструментом...\n" +
                           "Они помогают создавать гибкие и поддерживаемые системы.\n";

        ArticleService processor = new ArticleService();
        XMLArticleBuilder builder = new XMLArticleBuilder();

        try {
            ArticleXML xmlArticle = processor.processTXT(txtContent, builder);
            System.out.println(xmlArticle);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void checkAbstractFactory() {
        FilmOrder order = new FilmOrder();

        order.setFactory(new RussianFilmFactory());
        order.playFilm();

        System.out.println("---");

        order.setFactory(new EnglishFilmFactory());
        order.playFilm();
    }

    public static void checkFactory() {
        RandomShapeGenerator generator = new RandomShapeGenerator();
        
        for (int i = 0; i < 5; i++) {
            TetrisShape shape = generator.generateShape();
            shape.draw();
        }
    }
}