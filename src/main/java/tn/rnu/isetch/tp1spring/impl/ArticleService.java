package tn.rnu.isetch.tp1spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.rnu.isetch.tp1spring.model.Article;
import tn.rnu.isetch.tp1spring.repository.ArticleRepository;
import tn.rnu.isetch.tp1spring.service.IArticleService;

import java.util.List;

@Service
public class ArticleService implements IArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article update(Article article) {
        article.setId(article.getId());
        return articleRepository.save(article);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        articleRepository.deleteById(id);
    }


}
