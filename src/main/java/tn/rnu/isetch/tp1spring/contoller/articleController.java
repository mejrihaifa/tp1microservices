package tn.rnu.isetch.tp1spring.contoller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.rnu.isetch.tp1spring.dto.ArticleDto;
import tn.rnu.isetch.tp1spring.model.Article;
import tn.rnu.isetch.tp1spring.service.impl.ArticleService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class articleController {
    @Autowired
    private ArticleService articleService;
    ModelMapper modelMapper = new ModelMapper();
    Article article ;
    @GetMapping(value="/articles")
    public List<ArticleDto> listArticle(){
        List<Article> listArticle = articleService.findAll();
        List<ArticleDto> listDto = new ArrayList<ArticleDto>();
        listArticle.forEach(article1 -> {
            listDto.add( modelMapper.map(article1,ArticleDto.class)) ;
        });
        return listDto;
    }
    @DeleteMapping(value = "/articles/{id}" )
    public void delete(@PathVariable(name = "id") Long id){
        articleService.deleteById(id);
    }
    @PutMapping(value = "/articles" )
    public Article update(@RequestBody Article article){
        return articleService.update(article);
    }
    @PostMapping(value = "/articles")
    public Article save(@RequestBody Article article){
        return articleService.save(article);
    }

}
