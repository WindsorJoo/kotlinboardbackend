package org.kotlin_board.controller

import org.kotlin_board.dto.ArticleDto
import org.kotlin_board.service.ArticleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/articles")
class Article_controller (val articleService: ArticleService){

    @GetMapping
    fun articles() : List<ArticleDto> {
        return articleService.retrieveArticles()
    }

}