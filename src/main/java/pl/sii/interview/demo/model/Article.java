package pl.sii.interview.demo.model;

import java.util.List;

public class Article {

    private String title;
    private String description;
    private boolean publihed;
    private String someOtherField;

    private List<Comment> comments;

    public Article(String title, String description, List<Comment> comments) {
        this.title = title;
        this.description = description;
        this.comments = comments;
    }
}
