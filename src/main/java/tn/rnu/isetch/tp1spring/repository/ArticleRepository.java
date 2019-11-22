package tn.rnu.isetch.tp1spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.rnu.isetch.tp1spring.model.Article;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
