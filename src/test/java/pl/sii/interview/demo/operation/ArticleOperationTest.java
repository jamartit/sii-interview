package pl.sii.interview.demo.operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticleOperationTest {

    @Test
    void dummyTest() {
        Operation operation = new ArticleOperation();
        assertEquals(5, operation.createDummyArticles().size());
    }

}