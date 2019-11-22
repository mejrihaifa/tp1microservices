package tn.rnu.isetch.tp1spring.service;

import org.springframework.stereotype.Service;
import tn.rnu.isetch.tp1spring.model.Article;
import java.util.List;

public interface IArticleService {
    public Article save(Article article);
    public Article update(Article article);
    public List<Article> findAll();
    public void deleteById(Long id);
}
