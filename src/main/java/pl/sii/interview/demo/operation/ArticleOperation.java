package pl.sii.interview.demo.operation;

import org.springframework.stereotype.Service;
import pl.sii.interview.demo.model.Article;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleOperation implements Operation {

    @Override
    public List<Article> resolveArticlesWithTitleInDescription(List<Article> sourceArticles) {
        return null;
    }

    @Override
    public List<Article> resolveForPublishedArticles(List<Article> sourceArticles) {
        return null;
    }

    @Override
    public List<String> resolveArticleTitles(List<Article> sourceArticles) {
        return null;
    }

    @Override
    public Optional<Article> resolveArticlesByKeywordInDescription(List<Article> sourceArticles, String keyword) {
        for (Article article : sourceArticles) {
            //...
        }
        return Optional.empty();
    }
}
