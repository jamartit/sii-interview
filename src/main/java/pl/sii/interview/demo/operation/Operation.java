package pl.sii.interview.demo.operation;

import pl.sii.interview.demo.model.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface Operation {

    List<Article> resolveArticlesWithTitleInDescription(List<Article> sourceArticles);

    List<Article> resolveArticlesByKeyword(List<Article> sourceArticles, String keyword);

    List<String> resolveArticleTitles(List<Article> sourceArticles);

    Optional<Article> resolveArticlesByKeywordInDescription(List<Article> sourceArticles, String keyword);

    default List<Article> createDummyArticles() {
        List<Article> articles = new ArrayList<>();

        articles.add(new Article("Article#1", "Some description for article 1", new ArrayList<>()));
        articles.add(new Article("Article#2", "Some description for article 2", null));
        articles.add(new Article("Article#3", null, new ArrayList<>()));
        articles.add(new Article("Article#4", "Article#4 Some description for article 4", new ArrayList<>()));
        articles.add(new Article("Article#5", "Some description for article 5", new ArrayList<>()));

        return articles;
    }
}
