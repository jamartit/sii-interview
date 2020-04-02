package pl.sii.interview.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sii.interview.demo.model.Article;
import pl.sii.interview.demo.operation.ArticleOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ArticleController {

    private ArticleOperation articleOperation;

    @RequestMapping(value = "/allArticles")
    public ResponseEntity findAllArticles() {
        List<Article> source = articleOperation.createDummyArticles();
        return new ResponseEntity(source, HttpStatus.OK);
    }

    @RequestMapping(value = "/findByKeyword")
    public ResponseEntity findWithKeyword() {
        String keyword = "";
        List<Article> source = articleOperation.createDummyArticles();
        Optional<Article> result = articleOperation.resolveArticlesByKeywordInDescription(source, keyword);
        return new ResponseEntity(result, HttpStatus.OK);
    }


}
